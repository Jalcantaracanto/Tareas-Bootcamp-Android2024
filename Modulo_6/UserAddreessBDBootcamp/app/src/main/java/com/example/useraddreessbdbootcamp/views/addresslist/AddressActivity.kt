package com.example.useraddreessbdbootcamp.views.addresslist

import android.os.Bundle
import android.text.InputType
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.useraddreessbdbootcamp.R
import com.example.useraddreessbdbootcamp.database.AppDataBase
import com.example.useraddreessbdbootcamp.entities.Address
import com.example.useraddreessbdbootcamp.entities.User
import com.example.useraddreessbdbootcamp.repository.MainRepository
import com.example.useraddreessbdbootcamp.viewmodels.address.AddressViewModel
import com.example.useraddreessbdbootcamp.viewmodels.address.AddressViewModelFactory

class AddressActivity : AppCompatActivity() {

    private lateinit var addressViewModel: AddressViewModel
    private var userId: Long = -1L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_address)

        userId = intent.getLongExtra("USER_ID", -1L)


        val database = AppDataBase.getDatabase(application)
        val repository = MainRepository(database.userDao(), database.addressDao())
        val factory = AddressViewModelFactory(application, repository)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_address)
        val adapter = AddressListAdapter { address -> onAddressClick(address) }

        addressViewModel = ViewModelProvider(this, factory)[AddressViewModel::class.java]
       recyclerView.adapter = adapter
       recyclerView.layoutManager = LinearLayoutManager(this)

       addressViewModel.getAddressForUser(userId)

        addressViewModel.addressList.observe(this) { address -> address?.let {
                Log.d("MISDIRECCIONES", "Address List: $it")
                adapter.submitList(it)
           }
        }

        val addUserButton: Button = findViewById(R.id.btn_add_address)
        addUserButton.setOnClickListener {
            showAlertDialogInsertAdress()
        }

    }

    private fun onAddressClick(address: Address) {
        val optionsMenu = arrayOf("Actualizar Direccion", "Eliminar Direccion")
        AlertDialog.Builder(this)
            .setTitle("Selecciona una opción")
            .setItems(optionsMenu) { dialog, selected ->
                when (selected) {
                    0 -> showUpdateAddress(address)
                    1 -> showDeleteAddress(address)
                }
            }
            .show()
    }

    private fun showDeleteAddress(address: Address) {
        AlertDialog.Builder(this)
            .setTitle("Borrar Direccion")
            .setMessage("¿Está seguro que desea borrar esta direccion?")
            .setPositiveButton("Sí") { dialog, _ ->
                addressViewModel.deleteAddress(address, userId)
                dialog.dismiss()
            }
            .setNegativeButton("No") { dialog, _ -> dialog.cancel() }
            .show()
    }


    private fun showAlertDialogInsertAdress() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Add Address")

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL

        val cityInput = EditText(this)
        cityInput.hint = "City"
        layout.addView(cityInput)

        val streetInput = EditText(this)
        streetInput.hint = "Street"
        layout.addView(streetInput)

        val numberInput = EditText(this)
        numberInput.hint = "Number"
        numberInput.inputType = InputType.TYPE_CLASS_NUMBER
        layout.addView(numberInput)

        builder.setView(layout)

        builder.setPositiveButton("OK") { dialog, _ ->
            val street = streetInput.text.toString()
            val city = cityInput.text.toString()
            val number = numberInput.text.toString().toIntOrNull()

            if (street.isNotEmpty() && city.isNotEmpty() && number != null) {
                addressViewModel.insertAddress(
                    Address(
                        userOwnerId = userId,
                        street = street,
                        city = city,
                        number = number
                    ), userId
                )
                Toast.makeText(this, "Direccion Agregada Exitosamente", Toast.LENGTH_SHORT).show()
            }
            dialog.dismiss()
        }
        builder.setNegativeButton("Cancel") { dialog, _ -> dialog.cancel() }

        builder.show()
    }


    private fun showUpdateAddress(address: Address) {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Editar una Direccion")

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL

        val inputCity = EditText(this)
        inputCity.inputType = InputType.TYPE_CLASS_TEXT
        inputCity.hint = "Ciudad"
        inputCity.setText(address.city)
        layout.addView(inputCity)

        val inputStreet = EditText(this)
        inputStreet.inputType = InputType.TYPE_CLASS_TEXT
        inputStreet.hint = "Calle"
        inputStreet.setText(address.street)
        layout.addView(inputStreet)

        val inputNumber = EditText(this)
        inputNumber.inputType = InputType.TYPE_CLASS_NUMBER
        inputNumber.hint = "Número"
        inputNumber.setText(address.number.toString())
        layout.addView(inputNumber)

        builder.setView(layout)

        builder.setPositiveButton("OK") { dialog, _ ->

            val street = inputStreet.text.toString()
            val city = inputCity.text.toString()
            val number = inputNumber.text.toString().toIntOrNull()

            address.city = city
            address.street = street

            if (street.isNotEmpty() && city.isNotEmpty() && number != null) {
                addressViewModel.updateAddress(address, userId)
                Log.d("MISDIRECCIONES", "Address updated: $address")
            }
            dialog.dismiss()
        }

        builder.setNegativeButton("Cancelar") { dialog, _ -> dialog.cancel() }
        builder.show()
    }
}
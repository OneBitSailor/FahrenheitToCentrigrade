package app.creation.viewmodeldemo

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlin.math.roundToInt

class DemoViewModel : ViewModel() {
    var isFahrenheit by mutableStateOf(true)
    var result by mutableStateOf("")

    fun convertTemperature(temp: String){
        result = try {
            val tempInt = temp.toInt()
            when{
                isFahrenheit -> {
                    ((tempInt * 32) * 0.5556).roundToInt().toString()
                }
                else -> {
                    ((tempInt * 1.8) + 32).roundToInt().toString()
                }
            }
        }catch (e: Exception){
            "Invalid Entry"
        }
    }

    fun switchChange(){
        isFahrenheit = !isFahrenheit
    }
}
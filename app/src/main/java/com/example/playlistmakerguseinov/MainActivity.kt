package com.example.playlistmakerguseinov

// Импорт необходимых библиотек для работы с Android-компонентами
import android.os.Bundle
import androidx.activity.enableEdgeToEdge // Для активации полноэкранного режима
import androidx.appcompat.app.AppCompatActivity // Базовый класс для Activity
import androidx.core.view.ViewCompat // Для работы с окнами и их атрибутами
import androidx.core.view.WindowInsetsCompat // Для управления отступами системных панелей

// Основной класс приложения, представляющий Activity
class MainActivity : AppCompatActivity() {
    // Переопределение метода жизненного цикла Activity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) // Вызов метода суперкласса

        // Активация поддержки полноэкранного режима с учетом вырезов экрана
        enableEdgeToEdge()

        // Установка макета, связанного с данной Activity
        setContentView(R.layout.activity_main)

        // Установка обработчика для управления отступами системных панелей
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            // Получение размеров системных панелей
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            // Установка отступов для представления (view)
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            // Возврат измененных отступов
            insets
        }
    }
}

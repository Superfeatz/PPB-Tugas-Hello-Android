
# 📱 Hello World Compose
Tugas untuk mata kuliah **Mobile Programming**. Project ini dibuat menggunakan **Jetpack Compose** di Android Studio untuk menampilkan teks sederhana "Hello, World!" dengan latar belakang hitam.


## 🛠 Fitur
- Menampilkan teks **"Hello, World!"** di tengah layar.  
- **Background gradient** dari warna hitam ke abu-abu gelap.  
- Menggunakan **Jetpack Compose** tanpa XML.

---

## 🖌️ Kustomisasi Background Gradient
Untuk mengganti warna background gradient, buka file:  
**`MainActivity.kt`** dan ubah bagian ini:

```kotlin
val gradientBackground = Brush.linearGradient(
    colors = listOf(
        Color(0xFF000000), // Hitam pekat
        Color(0xFF2C2C2C)  // Abu-abu gelap
    )
)
```

🔄 Ganti kode warna sesuai keinginan. Misalnya:
```kotlin
val gradientBackground = Brush.linearGradient(
    colors = listOf(
        Color(0xFF1E1E1E), // Abu-abu sangat gelap
        Color(0xFF3A3A3A)  // Abu-abu
    )
)
```

---

## 📦 Struktur Project
```
📦hello-world-compose
 ┣ 📂app
 ┃ ┣ 📂src
 ┃ ┃ ┣ 📂main
 ┃ ┃ ┃ ┣ 📂java/com/example/tugashelloworld
 ┃ ┃ ┃ ┃ ┣ 📜MainActivity.kt
 ┃ ┃ ┃ ┣ 📂res
 ┃ ┃ ┃ ┃ ┗ 📜themes.xml
 ┣ 📜build.gradle
 ┣ 📜README.md
```

---

## 🛠️ Dependensi
Project ini menggunakan:
- **Kotlin**  
- **Jetpack Compose**  
- **Material3**  

Pastikan `build.gradle` memiliki konfigurasi berikut:
```kotlin
implementation("androidx.compose.material3:material3:1.0.1")
implementation("androidx.compose.ui:ui:1.0.5")
```

---

## 🗂️ Referensi
- [Dokumentasi Jetpack Compose](https://developer.android.com/jetpack/compose)  
- [Material Design 3](https://m3.material.io/)  

---

## ✍️ Author
- **Nama:** Muhammad Hafidz Harridil Mahali  
- **NRP:** 5025221030 
- **Kelas:** Pemorgraman Perangkat Bergerak  

---

## 📜 Lisensi
Project ini dibuat untuk keperluan **tugas kuliah** dan tidak memiliki lisensi khusus.  

---

Terima kasih sudah mengunjungi repo ini! 🚀😎

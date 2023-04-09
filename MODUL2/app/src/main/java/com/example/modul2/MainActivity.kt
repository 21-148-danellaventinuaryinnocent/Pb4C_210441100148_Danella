package com.example.modul2
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView : RecyclerView
    lateinit var adapter : MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
        recyclerView.layoutManager = LinearLayoutManager (this)
        recyclerView.adapter = adapter
    }
        private fun init() {
            recyclerView = findViewById(R.id.recycler_view)

            var data = ArrayList<wisatakuku>()
            data.add(wisatakuku(R.drawable.download, "Wisata Batu Jeddih", text2 = "Bukit Jaddih sejatinya adalah tambang kapur. Uniknya, saat ini pertambangan masih berlangsung, sehingga ada alat berat dan truk yang berlalu-lalang mengangkut batu kapur. Menuju Bukit Jaddih tidak terlalu susah. Dari Surabaya setelah melewati Jembatan Suramadu, langsung saja gunakan aplikasi pencari arah. Meski letaknya gampang dicari, tapi tetap harus waspada karena jalan ke Bukit Jaddih terhitung sempit dan beberapa titik berlubang. Hanya butuh sekitar 20 menit dari Jembatan Suramadu ke Bukit Jaddih. Cukup membayar Rp 20.000 untuk parkir mobil dan Rp 5.000 per orang untuk masuk ke lokasi."))
            data.add(wisatakuku(R.drawable.arosbaya, "Bukit Kapur Arosbaya", text2 = "Bukit Kapur Arosbaya menjadi tempat instagenic di Bangkalan Madura Jawa Timur yang rekomended untuk dikunjungi. Banyak spot menarik di tempat wisata Bangkalan terbaru satu ini yang siap memanjakan aktivitas swafoto anda. Akhir pekan menjadi hari terbaik untuk berwisata bersama orang tercinta menikmati indahnya alam Indonesia yang tak ada habisnya.Kabupaten Bangkalan Madura memang tidak sepopuler kota lain di Jawa Timur seperti Malang dan Banyuwangi dengan destinasi wisata terbaiknya. Namun siapa sangka, kota di Madura satu ini menawarkan destinasi anti mainstream dengan suguhan alam mempesona. Salah satunya Bukit Kapur Arosbaya dengan spot instagenic untuk anda explore guna mendapatkan gambar kece."))
            data.add(wisatakuku(R.drawable.kholil, "Masjid Syaikhona Muhammad Kholil", text2 = "Masjid yang tak pernah sepi dari peziarah ini awalnya adalah sebuah pesantren yang dilengkapi mushala berukuran 8×10 meter. Namun, karena kebutuhan akan sarana peribadahan yang memadai untuk masyarakat sekitar dan ramainya peziarah, maka pada tahun 2006 dibangunlah masjid yang lebih besar dan representatif.Masjid terlihat sangat indah dengan bangunan besar yang kokoh dan detail ornamen yang tersebar di seluruh bagian bangunan. Keberadaan dua menara yang menjulang tinggi di sudut sayap kanan dan kiri bangunan juga semakin memperkuat kemegahan rumah ibadah tersebut."))
            data.add(wisatakuku(R.drawable.kemuning, "Pantai Siring Kemuning", text2 = "Bicara soal Kabupaten Bangkalan, kota satu ini juga punya destinasi wisata pantai cantik yang menarik untuk anda explore. Salah satunya Pantai Siring Kemuning dengan hamparan pasir putih bersih dan suasana alam mendamaikan jiwa. Tempat wisata yang cocok untuk berakhir pekan melepas penat dengan bermain di tempat satu ini.Jika anda berwisata di Kabupaten Bangkalan dan bingung mau liburan kemana? Cobalah explore keindahan alamnya. Pantai memang tempat terbaik untuk dikunjungi saat menghabiskan hari libur bersama anak dan keluarga. Berikut ulasan singkat dan review menarik objek wisata Pantai Siring Kemuning Bangkalan yang bisa dijadikan referensi berkunjung."))
            data.add(wisatakuku(R.drawable.mangrove, "Taman Belajar Mangrove Labuhan", text2 = "Perjalanan ke Taman Pendidikan Mangrove  di Kabupaten Bangkalan, Jawa Timur, memang melelahkan. Terletak di Desa Labuhan, Kecamatan Sepuluh, butuh waktu satu jam perjalanan dari Kota Bangkalan. Bila terjebak macet di pasar tradisional, ditambah lagi kondisi sejumlah ruas jalan bergelombang dan berlubang, perjalanan bisa molor hingga dua jam.Jalan masuk ke Desa Labuhan sempit, melintasi pemukiman warga. Bila dua mobil berpapasan, salah satu harus menepi. Di kanan kiri jalan ada hamparan ladang garam, sebagian besar tak berfungsi dan sebagian lagi dalam proses alih fungsi menjadi tambak udang. Sebuah plang dari seng di mulut gang jadi satu-satunya penanda menuju hutan mangrove."))
            data.add(wisatakuku(R.drawable.paseban, "Taman Paseban Kota Bangkalan", text2 = "Taman kota menjadi salah satu icon kebanggaan setiap daerah tak terkecuali dengan kota Bangkalan. Untuk kesekian kalinya taman kota Bangkalan mengalami revitalisasi, kali ini jelas tampilannya lebih indah dan rapi. Taman kota Bangkalan yang juga disebut dengan Taman Paseban ini berada tepat di tengah kota berhadapan dengan Masjid Agung Bangkalan dan bersebelahan dengan Gedung Rato Ebu."))
   adapter = MyAdapter(data)
        }
    }

package com.example.uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resepList = listOf<ResepClass>(
            ResepClass(
                R.drawable.ayamgeprek,
                resepname = "Resep Ayam Geprek",
                resepdate = "Lama Memasak: \n30 Menit",
                resepauthor = "Pembuat Resep: \nAkhiratul Akmal Agustiannoor",
                reseprate = "Rating: (4,7)",
                ratingbar = 4.7,
                resepdesc = "Bahan-Bahan: \n" +
                        "1. Ayam kampung 1 ekor\n" +
                        "2. Bumbu ayam grprek sederhana\n" +
                        "3. Bawang putih: 2 siung\n" +
                        "4. Ketumbar bubuk: 1 sendok makan\n" +
                        "5. Garam: 2 sendok teh\n" +
                        "6. Merica: 1 sendok teh\n" +
                        "7. Bahan Pelapis\n" +
                        "8. Tepung terigu: 4 sendok makan\n" +
                        "9. Baking powder: 1/2 sendok teh\n" +
                        "8. Telur: 1 butir\n" +
                        "9. Lada secukupnya\n" +
                        "10. Garam secukupnya\n" +
                        "11. Merica secukupnyaKisah \n" +

                        "\nBumbu Sambal: \n" +
                        "1. Cabe rawit: 10 buah (sesuai selera)\n" +
                        "2. Bawang merah: 4 buah\n" +
                        "3. Bawang putih: 3 siung\n" +
                        "4. Tomat: 1 buah\n" +
                        "3. Garam secukupnya\n" +
                        "4. Gula secukupnya\n" +

                        "\nCara Membuat dan Memasak:\n" +
                        "1. Siapkan kukusan dengan api sedang, dan kukus potongan daging ayam dengan bumbu yang telah disiapkan kurang lebih 15 menit. \n" +
                        "2. Kemudian, angkat kukusan daging ayam lalu tiriskan.\n" +
                        "3. Siapkan sebuah mangkuk, kemudian masukkan telur, garam merica dan 1 sdm tepung terigu, lalu kocokkan hingga rata.\n" +
                        "4. Selanjutnya siapkan wadah atau piring yang rata, kemudian masukkan 3 sdm tepung terigu, lada, garam serta baking powder, dan aduk hingga rata.\n" +
                        "5. Potongan ayam yang telah dikukus tadi dilapisi dengan adonan telur dan tepung kering\n" +
                        "6. Selanjutnya panaskan minyak goreng, dan goreng daging ayam sampai crispy dan berwarna kuning. \n" +
                        "7. Setelah masak angkat\n"

            ),
            ResepClass(
                R.drawable.ayampenyet,
                resepname = "Resep Ayam Penyet",
                resepdate = "Lama Memasak: \n35 Menit",
                resepauthor = "Pembuat Resep: \nAkhiratul Akmal Agustiannoor",
                reseprate = "Rating: (4,7)",
                ratingbar = 4.7,
                resepdesc = "Bahan-Bahan: 1 lembar daun salam\n" +
                        "1. 2 cm jahe\n" +
                        "2. 3 cm lengkuas (di memarkan)\n" +
                        "3. Air secukupnya\n" +
                        "4. Minyak goreng secukupnya\n" +
                        "5. 4 siung bawang putih\n" +
                        "6. 5 siung bawang merah\n" +
                        "7. 9buah cabai rawit\n" +
                        "8. 5 buah cabai merah\n" +
                        "9. 1 cm kunyit\n" +

                        "\nCara Membuat dan Memasak:\n" +
                        "1. Cara membuat ayam penyet pertama yang harus dilakukan yakni menghaluskan terlebih dahulu bumbu halus yang sudah disiapkan. Sebaiknya Anda menghaluskannya dengan cara manual atau dengan cara diuleg agar menghasilkan cita rasa yang khas dan enak.\n" +
                        "2. Siapkan panci dan masukan air bersih secukupnya, kemudian masukan bumbu yang sudah dihaluskan. Masukkan juga daging ayam yang sudah dipotong.\n" +
                        "3. Masak dengan api sedang dan sesekali diaduk agar bumbu meresap. Jangan lupa untuk menutup panci agar cepat matang.\n" +
                        "4. Anda bisa menambahkan air apabila daging ayam dirasa kurang empuk.\n" +
                        "5. Setelah matang, matikan api dan diamkan agar cepat dingin\n" +
                        "6. Siapkan wajan dengan api sedang dan tuangkan minyak yang agak banyak agar daging ayam bisa terendam.\n" +
                        "7. Masukkan daging ayam dan goreng hingga berwarna kuning kecokelatan.\n" +
                        "8. Setelah matang, angkat, dan tiriskan.\n"
            ),
            ResepClass(
                R.drawable.ayamrica,
                resepname = "Resep Ayam Rica - Rica",
                resepdate = "Lama Memasak: \n35 Menit",
                resepauthor = "Pembuat Resep: \nAAkhiratul Akmal Agustiannoor",
                reseprate = "Rating: (4,6)",
                ratingbar = 4.6,
                resepdesc = "Bahan-Bahan: \n" +
                        "1. 1 Kg daging ayam kampung\n" +
                        "2. 2 buah jeruk nipis/ lime\n" +
                        "3. 7 lembar Daun jeruk\n" +
                        "4. 5 Daun Bawang\n" +
                        "5. 1 cm jahe\n" +
                        "6. 1 cm lengkuas\n" +
                        "7. 1 sdt Garam\n" +
                        "8. 1 sdt Gula pasir\n" +
                        "9. 1 sdt Merica\n" +
                        "10. 2 btg serai\n" +
                        "11.  buah cabe rawit\n" +
                        "12. Minyak goreng\n" +
                        "13. Kaldu Ayam\n" +
                        "14 Daun Kemangi\n" +

                        "\nCara Membuat dan Memasak:\n" +
                        "1. Bumbu Ayam Rica-rica\n" +
                        "2. Masukkan cabe merah besar, bawang merah, bawang putih, kemiri, dan minyak goreng secukupnya, kedalam blender kemudian blender dan haluskan.\n" +
                        "3. Setelah halus diblender, bumbu ayam rica-rica yang telah dihaluskan dimasukkan ke wajan yang telah dipanaskan sebelumnya, lalu kemudian ditumis.\n" +
                        "4. Pada saat proses tumis bumbu ayam rica-rica, tambahkan irisan jahe kemudian aduk (oseng-oseng) sampai merata. \n" +
                        "5. Masih dalam proses menggoreng, atau menumis bumbu halus ayam rica rica, tambahkan laos yang telah diiris kedalam bumbu ayam rica2.\n" +
                        "6. Kemudian tambahkan kembali irisan batang serai, lalu aduk (oseng-oseng) tumisan bumbu ayam rica-rica.\n" +
                        "7. Lalu tambahkan sedikit gula pasir dan perasan air jeruk nipis.\n" +
                        "8. Tambahkan irisan daun bawang dan daun jeruk kedalam tumisan bumbu ayam rica-rica.\n" +
                        "9. Tambahkan, cabe rawit utuh, serta daun kemangi kedalam tumisan bumbu ayam rica-rica.\n" +
                        "10. Langkah selanjutnya adalah mengolah daging ayam kampung rica-rica.\n" +
                        "11. Cuci bersih daging ayam yang telah dipotong sesuai selera, kemudian tambahkan garam dan aduk hingga rata.\n" +
                        "12. Lalu tambahkan perahan air lime/ jeruk nipis kedalam potongan daging ayam rica-rica.\n" +
                        "13. Selanjutnya aduk daging ayam rica-rica hingga rata, kemudian masukkan kedalam minyak goreng yang telah dipanaskan dan goreng hingga kering/ matang.\n" +
                        "14. Langkah selanjutnya adalah memasukkan potongan daging ayam yang telah masak digoreng, kedalam bumbu ayam rica-rica yang sedang ditumis.\n" +
                        "15. Tambahkan air kaldu ayam, kemudian aduk rata sampai ayam rica-rica matang.\n"
            ),
            ResepClass(
                R.drawable.friedchicken,
                resepname = "Resep Ayam Fried Chicken",
                resepdate = "Lama Memasak: \n15 Menit",
                resepauthor = "Pembuat Resep: \nAkhiratul Akmal Agustiannoor",
                reseprate = "Rating: (4,8)",
                ratingbar = 4.8,
                resepdesc = "Bahan-Bahan: "+
                        "1. Daging ayam 1 kg (potong menjadi 8 bagian)\n" +
                        "2. Bawang putih 4 siung, dihaluskan\n" +
                        "3. Lada secukupnya\n" +
                        "4. Kaldu ayam bubuk secukupnya\n" +
                        "5. Bubuk ketumbar secukupnya\n" +
                        "6. Kunyit 5 cm dihaluskan\n" +
                        "7. Garam secukupnya\n" +
                        "8. Minyak untuk menggoreng secukupnya\n" +
                        "9. Bahan lapisan dan tepung:\n" +
                        "10. Telur 1 butir dikocok lepas\n" +
                        "11. Tepung serbaguna 1 bungkus (100 gram)\n" +
                        "12. Terigu 100 gram\n" +
                        "13. Tepung beras 50 gram\n" +

                        "\nCara Membuat dan Memasak:\n" +
                        "1. Cuci bersih potongan daging ayam terlebih dahulu sampai bersih dari segala kotoran, lalu masak bersama bumbu bawang putih, lada, ketumbar, kunyit, kaldu (opsional) dan garam. Masak hingga daging matang sempurna dan bumbu meresap ke dalam dagingnya, kemudian angkat dan tiriskan.\n" +
                        "2. Mulai siapkan telur, dikocok lepas di dalam mangkok, beri sedikit kaldu bubuk jika suka agar cita rasanya semakin gurih.\n" +
                        "3. Campurkan tepung beras, terigu dan tepung bumbu serbaguna di sebuah mangkok yang lain.\n" +
                        "4. Celupkan daging ayam yang sudah ditiriskan ke dalam telor kocok, lalu gulingkan di atas campuran tepung yang sudah disiapkan.\n" +
                        "5. Panaskan minyak goreng di dalam wajan, goreng ayam yang sudah dibaluri tepung sampai menjadi kuning kecokelatan.\n" +
                        "6. Ayam goreng krispi yang sudah matang pasti renyah dan gurih, siap dihidangkan sebagai menu"
            ),
            ResepClass(
                R.drawable.ayamteriyaki,
                resepname = "Resep Ayam Teriyaki",
                resepdate = "Lama Memasak: \n30 Menit",
                resepauthor = "Pembuat Resep: \nAkhiratul Akmal Agustiannoor",
                reseprate = "Rating: (4,5)",
                ratingbar = 4.5,
                resepdesc = "Bahan-Bahan: \n" +
                        "1. Paha ayam tanpa tulang 400 gram\n" +
                        "2. Bombay 1 buah, iris halus\n" +
                        "3. Bawang putih 1 siung, memarkan\n" +
                        "4. Jahe 2 cm, diparut\n" +
                        "5. Bumbu teriyaki instan 25 ml\n" +
                        "6. Minyak sayur 2 sdm\n" +

                        "\nCara Membuat dan Memasak:\n" +
                        "1. Pertama, cuci bersih ayam lalu tiriskan sampai air cucian ayam habis, kemudian iris-iris dengan ukuran 3 cm x 3 cm, lalu baluri dengan bumbu teriyaki instan. Biarkan ayam selama 10 menit agar bumbu meresap ke dalam daging ayam.\n" +
                        "2. Panaskan minyak sayur, tumis bawang Bombay, bawang putih dan jahe sampai aroma harumnya keluar.\n" +
                        "3. Masukkan daging ayam yang sudah dimarinasi dan masak hingga matang dan bumbu mengental. Sajikan ayam teriyaki  selagi hangat."
            ),
            ResepClass(
                R.drawable.ayamkecap,
                resepname = "Resep Ayam Kecap",
                resepdate = "Lama Memasak: \n28 Menit",
                resepauthor = "Pembuat Resep: \nAkhiratul Akmal Agustiannoor",
                reseprate = "Rating: (4,4)",
                ratingbar = 4.4,
                resepdesc = "Bahan-Bahan: \n" +
                        "1. 500 Gram ayam (dipotong jadi 6 bagian)\n" +
                        "2. 1 Buah bawang bombay (iris tipis)\n" +
                        "3. 5 Siung bawang putih (cincang kasar)\n" +
                        "4. 6 Sendok makan kecap manis\n" +
                        "5. 2 Sendok makan saus tiram\n" +
                        "6. 1 Buah tomat kecil (iris)\n" +
                        "7. 1 Sendok makan kecap asin\n" +
                        "8. 3 Gelas air\n" +
                        "9. Garam secukupnya\n" +
                        "10. Gula secukupnya\n" +
                        "11. Merica secukupnya\n" +
                        "12. Seledri secukupnya\n" +
                        "13. Wijen sangrai secukupnya\n" +

                        "\nCara Membuat dan Memasak:\n" +
                        "1. Goreng ayam sampai setengah matang.\n" +
                        "2. Tumis bawang bombay, bawang putih dan tomat sampai harum. \n" +
                        "3. Masukkan ayam yang sudah digoreng.\n" +
                        "4. Tambahkan air, lalu masukkan saus tiram, kecap manis, dan kecap asin. \n" +
                        "5. Bumbui dengan garam, gula, penyedap rasa, dan merica.\n" +
                        "6. Masak sampai air menyusut\n" +
                        "7. Selanjutnya sajikan dengan taburan seledri cincang dan wijen sangrai."
            ),
            ResepClass(
                R.drawable.ayampepes,
                resepname = "Resep Ayam Pepes",
                resepdate = "Lama Memasak: \n35 Menit",
                resepauthor = "Pembuat Resep: \nAkhiratul Akmal Agustiannoor",
                reseprate = "Rating: (4,5)",
                ratingbar = 4.5,
                resepdesc = "Bahan-Bahan: \n" +
                        "1. Ayam 2 ekor segar yang dipotong sesuai selera\n" +
                        "2. Daun kemangi segar 4 ikat\n" +
                        "3. Lengkuas 2 ruas jari, potong kecil-kecil\n" +
                        "4. Jeruk nipis 2 buah, peras dan ambil airnya\n" +
                        "5. Daun salam 8 lembar\n" +
                        "6. Tomat hijau 4 buah ukuran sedang, iris kecil-kecil\n" +
                        "7. Daun jeruk 15 lembar, cuci bersih\n" +
                        "8. Cabai merah 2 buah, iris serong\n" +
                        "9. Cabai rawit sesuai selera\n" +
                        "10. Daun bawang 4 batang iris serong\n" +
                        "11. Serau 4 batang, bagian putihnya dan potong kecil-kecil\n" +
                        "12. Kaldu ayam instan (opsional)\n" +
                        "13. Garam beryodiun 15 gram\n" +
                        "14. Air bersih ½ liter\n" +
                        "15. Minyak goreng secukupnya\n" +
                        "16. Daun pisang\n" +
                        "17. Bumbu halus:\n" +
                        "18. Bawang merah 50 gram\n" +
                        "19. Bawang putih 15 gram\n" +
                        "20. Kemiri sangria 15 gram\n" +
                        "21. Kunyit 15 gram\n" +

                        "\nCara Membuat dan Memasak:\n" +
                        "1. Pertama-tama cuci daging ayam yang sudah disiapkan dan dipotong-potong dengan air mengalir hingga bersih dari segala kotoran, tiriskan. Kemudian siram dengan perasan jeruk nipis untuk menghilangkan aroma amis ayamnya selama 15 menit, cuci bersih lagi.\n" +
                        "2. Panaskan wajan dan tumis bumbu halus dengan minyak sedikit sambil diaduk-aduk sampai aroma harumnya keluar. Lalu masukkan daging ayam ke dalam wajan penggorengan, aduk lagi hingga rata dengan bumbunya.\n" +
                        "3. Tambahkan 12 liter air bersih, gula pasir, kaldu ayam instan (opsional) dan gara beryodium. Aduk rata dan masak sampai air menyusut dan daging ayamnya matang.\n" +
                        "4. Sambil menunggu agak dingin siapkan daun pisang yang akan digunakan untuk membungkus pepes ayam. Kemudian tata dengan berurutan daun pisang, daun jeruk, daun salam, daging ayam, irisan tomat, serai, daun kemangi dan irisan tomat lagi.\n" +
                        "5. Bungkus pepes ayam dengan rapi agar bahan tidak berantakan sematkan lidi di bagian ujung-ujungnya. Masukkan pepes ayam ke dalam panci kukusan lalu tunggu hingga matang sekitar 1 jam dengan kompor gas.\n" +
                        "6. Buka dan keluarkan pepes ayam dari kukusan, maka pepes ayam lezat siap dihidangkan bersama nasi hangat. Atau jika menyukai aroma bakaran, pepes ayam yang sudah dikukus tadi dibakar dulu diatas bara api sampai daun pisang mengering."
            ),
            ResepClass(
                R.drawable.ayamsemur,
                resepname = "Resep Ayam Semur",
                resepdate = "Lama Memasak: \n27 Menit",
                resepauthor = "Pembuat Resep: \nAkhiratul Akmal Agustiannoor",
                reseprate = "Rating: (4,5)",
                ratingbar = 4.5,
                resepdesc = "Bahan-Bahan: \n" +
                        "1. ½ ekor ayam, potong 6 bagian, goreng hingga setengah matang\n" +
                        "2. 3 buah kentang, kupas, potong agak besar, goreng hingga matang\n" +
                        "3. 1 batang serai, memarkan\n" +
                        "4. 100 ml Kecap Manis Bango\n" +
                        "5. 1 bungkus Royco rasa Ayam\n" +
                        "6. ½ butir pala, parut\n" +
                        "7. ½ sdt merica putih putih bubuk\n" +
                        "8. ¼  sdt garam\n" +
                        "9. 1 liter air\n" +
                        "10. 3 sdm minyak, untuk menumis\n" +
                        "11. 2 sdm bawang merah goreng\n" +
                        "12. 5 butir bawang merah\n" +
                        "13. 5 siung bawang putih\n" +
                        "14. 2 cmj ahe\n" +

                        "\nCara Membuat dan Memasak:\n" +
                        "1. Tumis bumbu halus dan serai hingga harum. Masukkan ayam, aduk rata.\n" +
                        "2. Tambahkan kentang, Kecap Manis Bango, royco ayam, pala, merica, garam, dan air. Aduk. Didihkan. \n" +
                        "3. Kecilkan api, lanjutkan memasak hingga ayam matang dan kuah mengental.\n" +
                        "4. Tambahkan bawang merah goreng, aduk rata. Angkat dan sajikan."
            ),
            ResepClass(
                R.drawable.ayammentega,
                resepname = "Resep Ayam Mentega",
                resepdate = "Lama Memasak: \n20 Menit",
                resepauthor = "Pembuat Resep: \nAkhiratul Akmal Agustiannoor",
                reseprate = "Rating: (4,3)",
                ratingbar = 4.3,
                resepdesc = "Bahan-Bahan: \n" +
                        "1. 1/2 ekor ayam (potong menjadi 12 bagian)\n" +
                        "2. 1 buah jeruk nipis (peras airnya)\n" +
                        "3. 1 siung bawang putih (cincang halus)\n" +
                        "4. Minyak goreng \n" +
                        "5. 1/2 siung bawang bombay (iris tipis)\n" +
                        "6. 1 sendok makan mentega\n" +
                        "7. 2 sendok makan kecap inggris\n" +
                        "8. 1/2 sendok teh gula pasir\n" +
                        "9. 1 sachet saus tiram\n" +
                        "10. 50 ml air\n" +

                        "\nCara Membuat dan Memasak:\n" +
                        "1. Cuci ayam yang telah dipotong sesuai selera hingga bersih. \n" +
                        "2. Potong jeruk nipis dan lumuri daging ayam dengan air perasan jeruk nipis.\n" +
                        "3. Lumuri dengan potongan bawang putih.\n" +
                        "4. Panaskan minyak goreng\n" +
                        "5. Selanjutnya goreng potongan daging ayam hingga matang dan berwarna kecoklatan. \n" +
                        "6. Lalu angkat dan sisihkan."
            ),
            ResepClass(
                R.drawable.sotoayam,
                resepname = "Resep Soto Ayam",
                resepdate = "Lama Memasak: \n25 Menit",
                resepauthor = "Pembuat Resep: \nAkhiratul Akmal Agustiannoor",
                reseprate = "Rating: (4,6)",
                ratingbar = 4.5,
                resepdesc = "Bahan-Bahan: " +
                        "1. Daging ayam 1 kg (potong menjadi 8 bagian)\n" +
                        "2. Bawang putih 4 siung, dihaluskan\n" +
                        "3. Lada secukupnya\n" +
                        "4. Kaldu ayam bubuk secukupnya\n" +
                        "5. Bubuk ketumbar secukupnya\n" +
                        "6. Kunyit 5 cm dihaluskan\n" +
                        "7. Garam secukupnya\n" +
                        "8. Minyak untuk menggoreng secukupnya\n" +
                        "9. Bahan lapisan dan tepung:\n" +
                        "10. Telur 1 butir dikocok lepas\n" +
                        "11. Tepung serbaguna 1 bungkus (100 gram)\n" +
                        "12. Terigu 100 gram\n" +
                        "13. Tepung beras 50 gram\n" +

                        "\nCara Membuat dan Memasak:\n" +
                        "1. Cuci bersih potongan daging ayam terlebih dahulu sampai bersih dari segala kotoran, lalu masak bersama bumbu bawang putih, lada, ketumbar, kunyit, kaldu (opsional) dan garam. Masak hingga daging matang sempurna dan bumbu meresap ke dalam dagingnya, kemudian angkat dan tiriskan.\n" +
                        "2. Mulai siapkan telur, dikocok lepas di dalam mangkok, beri sedikit kaldu bubuk jika suka agar cita rasanya semakin gurih.\n" +
                        "3. Campurkan tepung beras, terigu dan tepung bumbu serbaguna di sebuah mangkok yang lain.\n" +
                        "4. Celupkan daging ayam yang sudah ditiriskan ke dalam telor kocok, lalu gulingkan di atas campuran tepung yang sudah disiapkan.\n" +
                        "5. Panaskan minyak goreng di dalam wajan, goreng ayam yang sudah dibaluri tepung sampai menjadi kuning kecokelatan.\n" +
                        "6. Ayam goreng krispi yang sudah matang pasti renyah dan gurih, siap dihidangkan sebagai menu"
            ),
            ResepClass(
                R.drawable.telurbalado,
                resepname = "Resep Telur Balado",
                resepdate = "Lama Memasak: \n20 Menit",
                resepauthor = "Pembuat Resep: \nAkhiratul Akmal Agustiannoor",
                reseprate = "Rating: (4,4)",
                ratingbar = 4.4,
                resepdesc = "Bahan-Bahan: \n" +
                        "1. Enam butir telur, lalu direbus rebus\n" +
                        "2. Satu batang sereh geprek\n" +
                        "3. Satu sendok teh garam\n" +
                        "4. Satu sendok teh gula merah sisir\n" +
                        "5. Bumbu halus:\n" +
                        "6. Empat cabe merah besar, buang bijinya\n" +
                        "7. Lima cabe rawit\n" +
                        "8. Tiga bawang merah\n" +
                        "9. Dua siung bawang putih\n" +
                        "10. Satu butir kemiri\n" +
                        "11. Satu buah tomat\n" +

                        "\nCara Membuat dan Memasak:\n" +
                        "1. Goreng telor hingga matang.\n" +
                        "2. Tumis bumbu halus dan sereh hingga harum\n" +
                        "3. Masukan telur dan tambahkan garam dan gula secukupnya\n" +
                        "4. Aduk hingga rata, tes rasanya dan bila sudah oke, angkat dan sajikan."
            ),
            ResepClass(
                R.drawable.udangoseng,
                resepname = "Resep Udang Oseng",
                resepdate = "Lama Memasak: \n18 Menit",
                resepauthor = "Pembuat Resep: \nAkhiratul Akmal Agustiannoor",
                reseprate = "Rating: (4,3)",
                ratingbar = 4.3,
                resepdesc = "Bahan-Bahan: \n" +
                        "1. 250 gram udang\n" +
                        "2. 5 buah cabe rawit\n" +
                        "3. 4 siung bawang merah\n" +
                        "4. 3 siung bawang putih\n" +
                        "5. 1 ruas jahe\n" +
                        "6. 2 lembar daun jeruk purut\n" +
                        "7. garam secukupnya\n" +
                        "8. gula secukupnya\n" +

                        "\nCara Membuat dan Memasak:\n" +
                        "1. Cuci bersih udang, lalu sisihkan.\n" +
                        "2. Iris cabe, bawang merah dan bawang putih. Tumis hingga harum.\n" +
                        "3. Masukkan udang, jahe dan daun jeruk.\n" +
                        "4. Tambahkan air, gula dan garam. Masak hingga matang.\n" +
                        "5. Cek rasa, Oseng Udang Pedas siap disajikan."
            ),
            ResepClass(
                R.drawable.telurdadarbayam,
                resepname = "Resep Telur Dadar Bayam",
                resepdate = "Lama Memasak: \n10 Menit",
                resepauthor = "Pembuat Resep: \nAkhiratul Akmal Agustiannoor",
                reseprate = "Rating: (4,5)",
                ratingbar = 4.5,
                resepdesc = "Bahan-Bahan: \n" +
                        "1. 4 butir telur ayam dikocok lepas dalam sebuah wadah\n" +
                        "2. 1 ikat bayam dipetik daunnya lalu cuci bersih\n" +
                        "3. 2 buah kentang dikupas kulit dan cuci bersih lalu iris tipis-tipis\n" +
                        "4. garam dan merica secukupnya\n" +
                        "5. 1 buah bawang bombay dipotong dadu\n" +
                        "6. 1 buah tomat dipotong dadu\n" +
                        "7. minyak goreng atau margarin\n" +

                        "\nCara Membuat dan Memasak:\n" +
                        "1. Panaskan sedikit minyak atau margarin, tumis bawang bombay sampai layu kemudian masukkan kentang.\n" +
                        "2. Berikutnya masukkan tomat, aduk-aduk dan terakhir masukkan sayur bayamnya, aduk sebentar lalu angkat.\n" +
                        "3. Masukkan tumisan tersebut ke dalam kocokan telur, beri garam dan merica secukupnya lalu aduk rata.\n" +
                        "4. Panaskan lagi sedikit margarin atau minyak lalu goreng adonan di atas api kecil.\n" +
                        "5. Balik agar matang merata di kedua sisi kemudian angkat dan siap untuk disajikan."
            ),
            ResepClass(
                R.drawable.escendol,
                resepname = "Resep ES Cendol",
                resepdate = "Lama Memasak: \n10 Menit",
                resepauthor = "Pembuat Resep: \nAkhiratul Akmal Agustiannoor",
                reseprate = "Rating: (4,5)",
                ratingbar = 4.5,
                resepdesc = "Bahan-Bahan: \n" +
                        "1. 100 gram tepung beras\n" +
                        "2. 4 sdm tepung tapioka\n" +
                        "3. 500 ml air rebusan pandan\n" +
                        "4. 200 gram gula merah\n" +
                        "5. 500 ml air\n" +
                        "6. Santan 300 ml air\n" +
                        "7. 1 bungkus santan instan\n" +

                        "\nCara Membuat dan Memasak:\n" +
                        "1. Masak tepung beras, tapioka, dan air pandan sampai matang dan meletup-letup.\n" +
                        "2. Angkat dan dinginkan.\n" +
                        "3. Cetak dawet dengan saringan dan siapkan air es di bawahnya.\n" +
                        "4. Masak gula merah dan air sampai mendidih.\n" +
                        "5. Masak santan dan juga air.\n" +
                        "6. Campurkan gula, santan, dan cendol atau dawet.\n" +
                        "7. Beri es batu agar segar.\n" +
                        "8. Sajikan."
            ),
            ResepClass(
                R.drawable.essarangburung,
                resepname = "Resep ES Sarang Burung",
                resepdate = "Lama Memasak: \n10 Menit",
                resepauthor = "Pembuat Resep: \nAkhiratul Akmal Agustiannoor",
                reseprate = "Rating: (4,5)",
                ratingbar = 4.5,
                resepdesc = "Bahan-Bahan: \n" +
                        "1. 1 bungkus agar-agar\n" +
                        "2. 200 gram gula pasir\n" +
                        "3. 1 sdm biji selasih, rendam dalam air panas\n" +
                        "4. 3 sdm gula, larutkan dengan air panas\n" +
                        "5. sirup fruit punch\n" +
                        "6. nata de coco secukupnya\n" +
                        "7. es batu secukupnya\n" +

                        "\nCara Membuat dan Memasak:\n" +
                        "1. Masak agar-agar seperti biasa. Setelah dingin bisa langsung diparut.\n" +
                        "2. Siapkan gelas, siapkan es batu, masukkan agar-agar, nata de coco, dan biji selasih.\n" +
                        "3. Tambahkan air gula dan sirup sesuai selera.\n" +
                        "4. Es sarang burung siap disajikan."
            ),

        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ResepAdapter(this, resepList) {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}
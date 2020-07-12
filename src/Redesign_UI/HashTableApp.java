/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Redesign_UI;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 /*
      A little program to test the HashTable class.  Note that I
      start with a really small table so that I can easily test
      the resize() method.
   */

   public class HashTableApp {
    
      public static void main(String[] args) throws IOException{
         
         MenuCari kata = new  MenuCari();
         String key,value;
         while (true) {
            System.out.println("\nMenu:");
            System.out.println("   1. test insert(key,value)");
            System.out.println("   2. test getValue(key)");
            System.out.println("   3. test FindKey(key)");
            System.out.println("   4. show complete contents of hash table.");
            System.out.print("Enter your command:  ");
            int choice=getChar();
            switch (choice) {
               case '1':
                    /*System.out.print("\n   Key = ");
                    key = getString();
                    System.out.print("   Value = ");
                    value =getString();
                    table.put(key,value);*/
                    kata.insert("Application Binary Interface"," adalah Pemafaran spesifikasi perangkat keras dan  sistem \noperasi yang sedang digunakan");
                    kata.insert("Access"," adalah Kegiatan mengambil atau menyimpan data dari atau \nke memori yatu ke disk drive");
                    kata.insert("Access Method"," adalah Perangkat lunak yang mengontrol pemindahan data \nantara penyimpanan utama dan peralatan input dan output dalam sebuah sitem");
                    kata.insert("Access Time"," adalah Waktu yang dibutuhkan untuk mengambil atau memasukkan \ndata dari atau ke memori ");
                    kata.insert("Accessories"," adalah Pada sistem operasi Windows, accessories adalah program-program, \nmisalnya Calculator, Notepad, Wordpad, Paint dan lain sebagainya");
                    kata.insert("Accumulator"," adalah Bagian dari arithmatic unit sebuah komputer untuk menyimpan \nhasil dari perhitungan sementara atau beberapa operasi lain");
                    kata.insert("Acknowledge"," adalah Tanda dari terminal penerima bahwa pengiriman pesan telah \nsampai tanpa ada kesalahan. Acknowledge berasal dari kata Acknowledgement");
                    kata.insert("Accoustic Coupler"," adalah Alat sejenis modem sederhana untuk mengirim data-data komputer \nmelalui saluran telepon. Alat ini mengubah sinyal biner menjadi sinyal akustik \nuntuk diterima mikrofon telepon, sinyal akustik dari speaker telepon akan diubah \nmenjadi sinyal digital. ");
                    kata.insert("ACL"," adalah Metode untuk membatasi penggunaan layanan secara selektif yaitu \ndengan membuat daftar layanan mana yang boleh diakses maupun yang tidak boleh \noleh host tertentu. ");
                    kata.insert("ACPI"," adalah Sebuah teknologi yang memungkinkan sistem operasi mengontrol \njumlah daya listrik yang digunakan oleh setiap perangkat yang dipasang pada komputer. ");
                    kata.insert("Active Task Button"," adalah Tombol perintah yang terletak pada taskbar  yang akan muncul \njika sebuah perintah harus dieksekusi. ");
                    kata.insert("Active"," adalah Segala sesuatu yang berhubungan dengan setiap alat \natau sistem yang sedang digunakan saat ini. ");
                    kata.insert("ActiveX"," adalah Lingkungan pemrograman yang dilakukan oleh Microsoft untuk menciptakan \nsistem yang aktif pada halaman web, yang juga mendukung Java, JavaScript, Visual Basic dan bahasa-bahasa \npemrograman lainnya yang semuannya itu terbatas dan hanya dapat digunakan pada Internet Explorer.");
                    kata.insert("ADC"," adalah Alat yang dipakai untuk mengubah sinyal analog menjadi sinyal digital.");
                    kata.insert("Add-in"," adalah Peralatan tambahan yang dipasangkan pada salah satu board yang tersedia. \nProgram-program pendukung yang ditambahkan pada sebuah program aplikasi.");
                    kata.insert("Address"," adalah Angka-angka yang menunjukkan lokasi di dalam memori sebagai tempat tersimpannya \ninformasi.");
                    kata.insert("Adobe PageMaker"," adalah Perangkat lunak aplikasi yang mengolah data untuk kebutuhan pembuatan \ndesain layout buku, cover untuk majalah, koran, dll. Biasanya dipakai oleh jenis usaha setting \nkomputer untuk keperluan pembuatan kartu undangan, kartu nama, kartu ucapan, kop surat, dan lain sebagainya.");
                    kata.insert("Adobe Photoshop"," adalah Perangkat lunak aplikasi yang mengolah data untuk kebutuhan pembuatan \ndesain layout buku, cover untuk majalah, koran, dll. Biasanya dipakai oleh jenis usaha setting \nkomputer untuk keperluan pembuatan kartu undangan, kartu nama, kartu ucapan, kop surat, dan lain sebagainya.");
                    kata.insert("ADSL"," adalah Pengiriman data digital tingkat tinggi di atas jalur line telepon.");
                    kata.insert("Advertiser"," adalah Sama artinya dengan Merchant, yaitu pedagang atau perusahaan yang memberikan \nkomisi.");
                    kata.insert("Affiliate Site"," adalah Halaman dimana iklan merchant dimasukkan. Kita bisa memasukkan iklan \nmerchant ke sembarang halaman yang ada dalam website, dan letaknya boleh disembarang tempat.");
                    kata.insert("AGP"," adalah Sebuah bus grafik berkecepatan tinggi yang secara langsung menghubungkan kartu \ngrafis dengan memori utama. AGP beroperasi independen dan terpisah dengan PCI bus dan umumnya \nberjalan pada 66MHz yaitu dua kali kecepatan PCI yang berjalan pada 33MHz. \nAGP 1x melakukan satu kali transfer per siklus kerja untuk melakukan transfer data maksimum 266 MB per detik. \nAGP 2x melakukan dua kali transfer data per satu siklus kerja yaitu 533 MB per detik \nsedangkan AGP 4x melakukan empat kali transfer per satu siklus kerja yaitu 1,06 GB per detik. \nSedangkan kecepatan transfer data maksimum pada PCI sendiri adalah 132 MB per detik.");
                    kata.insert("AI"," (Artificial Intelligence) :Ilmu yang mengembangkan komputer supaya dapat bekerja dan \nberpikir serta mengambil keputusan seperti layaknya manusia.");
                    kata.insert("ALGOL","(Algortihmic Oriented Language): Bahasa pemrograman tingkat tinggi yang digunakan \nuntuk menyelesaikan persoalan dalam langkah-langkah yang terbatas. \nUmumnya untuk membuat program-program science");
                    kata.insert("Aligment"," adalah Dalam jaringan komputer merupakan proses meratakan komponen sebuah sistem \nterhadap komponen lainnya. Misalnya sinkronisasi waktu komputer dari suatu sistem.");
                    kata.insert("Align"," Dari kata alignment, yaitu perintah dalam program pengolah kata untuk meratakan \nsebuah naskah, apakah rata kiri, kanan, atau tengah.");
                    kata.insert("Allocate"," adalah Instruksi untuk meletakkan sebagian memori komputer atau unit lainnya \ndi bawah kontrol program komputer.");
                    kata.insert("Alpha Numeric"," adalah Campuran antara karakter dan angka termasuk huruf (A-Z;a-z), \ntanda baca dan beberapa karakter khusus misalnya @, #, $, *, dan sebagainya.");
                    kata.insert("Alias"," adalah Nama kedua sebuah file, umumnya nama kedua lebih pendek dan mudah untuk \ndiingat daripada nama pertama.");
                    kata.insert("ALOHA"," adalah Teknik pengawasan akses tingkat menengah untuk media transmisi yang menangani banyak akses. \nPengiriman data akan dilakukan kapan saja oleh sebuah stasiun. \nPengiriman ini akan diulang apabila mendapat tanggapan NAK (terdapat kesalahan pengiriman) dari stasiun tujuan.");
                    kata.insert("Alt Key"," adalah Nama tombol pada keyboard yang terletak di sebelah kanan dan kiri tombol spasi. \nTombol ini baru berfungsi apabila ditekan bersamaan dengan tombol lain. \nDalam lingkungan Windows, tombol ini bersama dengan huruf tertentu dapat digunakan untuk membuka dan \nmemilih perintah pada menu secara cepat.");
                    kata.insert("ALU"," (Arithmetic and Logical Unit) :Bagian dari CPU yang berguna untuk memproses data secara \nlogika dan juga data-data yang memerlukan perhitungan. \nALU terdiri dari register-register untuk menyimpan informasi.");
                    kata.insert("AMD760"," adalah Chipset AMD760 adalah chipset AMD untuk prosesor Athlon.");
                    kata.insert("Analog"," adalah Bentuk dari komunikasi elektronik yang menggunakan gelombang elektromagnetik yang kontinu, \nseperti televisi dan radio. ");
                    kata.insert("Analog Sinyal"," adalah Gelombang elektromagnetik yang sinambung, memiliki kemampuan untuk dipancarkan \nmelalui bermacam-macam media dan jangkauannya jauh lebih besar daripada sinyal digital");
                    kata.insert("AND"," adalah Salah satu operator logika dari Aljabar Boolean untuk membandingkan apakah \ndua variable akan menghasilkan nilai benar (1) atau salah (0) ");
                    kata.insert("Anti Virus"," adalah Program yang dibuat khusus untuk mendeteksi file di dalam suatu drive \napakah terkena virus atau tidak.Program ini sekaligus menghilangkan virus tersebut.");
                    kata.insert("Application Program"," adalah Program komputer yang dibuat untuk mengerjakan atau menyelesaikan \nmasalah-masalah khusus, misalnya program penggajian.");
                    kata.insert("ARPANET"," adalah : Jaringan komputer yang dikembangkan dengan bantuan Advanced Research Project Agency, \nmerupakan cikal bakal dari Internet.");
                    kata.insert("Assembler"," adalah Program yang berfungsi untuk mengkonversi program dengan \nbahasa Assembly ke dalam bahasa mesin.");
                    kata.insert("Assembly"," adalah Proses penerjemahan program yang ditulis dengan \nbahasa pemrograman simbol ke dalam bahasa mesin.");
                    kata.insert("Assembly Language"," adalah Bahasa pemrograman tingkat rendah yang \nlebih menyerupai bahasa mesin dalam bentuk yang mudah diingat.");
                    kata.insert("Background"," adalah Warna atau gambar yang disusun untuk menciptakan efek \nlatar belakang dalam halaman web. ");
                    kata.insert("Backplane"," adalah Sebuah panel dimana sebuah papan sirkuit dalam sebuah peralatan \nplug dimasukkan; termasuk juga semua kabel yang saling menghubungkan sirkuit. ");
                    kata.insert("Backspace"," adalah Tombol keyboard bersimbl yang terletak diatas tombol Enter. \nBerfungsi untuk menghapus saut karakter sebelum kursor saat ini. ");
                    kata.insert("Backup"," adalah Salinan dari file program atau file data yang dibuat untuk memberi \njaminan agar data yang ada tidak hilang atau terhapus apabila terjadi sesuatu pada file aslinya. ");
                    kata.insert("Bandwith"," adalah Kapasitas transmsisi dari sambungan elektronik seperti \njaringan komunikasi bus komputer dan komputer channel. \nBiasa dilambangkan dengan bit per second atau Hertz. ");
                    kata.insert("Banner"," adalah Bagian yang tidak bergerak dalam dokumen Web sekalipun kita \nmenggulung scroolbar samapi ke akhir dokumen. Sekarang ini hanya Ineternet Explorer \nyang mendukung perintah banner. ");
                    kata.insert("Bar Code"," adalah Karakter numerik yang ditampilkan dalam bentuk balok-balok dengan \nbermacam-macam ketebalan. ");
                    kata.insert("Baterai CMOS"," adalah Baterai ini berfungsi untuk memberi tenaga pada motherboard dalam mengenali \nkonfigurasi yang terpasang, ketika ia tidak atau belum mendapatkan daya dari power supply. ");
                    kata.insert("Baud"," adalah Satuan kecepatan sinyal digita, yaitu batasan yang digunakan untuk menunjukkan \ntingkat kecepatan transmisi data. Biasanya dihitung dalam bit per detik. ");
                    kata.insert("Binary"," adalah Sistem penomoran yang digunakan komputer, hanya terdiri dari dua digit, yaitu 1 dan 0. \nHal ini disebabkan sirkuit elektronik yang digunakan komputer hanya memiliki dua status on dan off. ");
                    kata.insert("BIOS"," (Basic Input Output System) : \n1. Bagian dari sistem operasi yang bisa mengidentifikasi set program \nyang digunakan untuk mem-boot  komputer, sebelum menempatkan disket sistem. \nBIOS terdapat di ROM (Read Only Memory) dari sistem dan umumnya tersimpan secara permanen. \n2. Program yang digunakan mikroprosesor untuk menyalakan komputer. \nBIOS juga mengatur aliran data antara sistem operasi komputer dan perangkat tambahan yang terhubung pada komputer.");
                    kata.insert("Bipolar"," adalah Mengacu pada transistor biasa atau IC yang bertentangan dengan komponen MOS dan CMOS. ");
                    kata.insert("Bipolar Memory"," adalah Memori komputer yang memakai IC bipolar sebagai bagian dari memorinya. ");
                    kata.insert("Bit"," adalah Unit terkecil dari informasi. Satu bit cukup untuk menyatakan \nperbedaan antara ya dan tidak, atas dan bawah, on dan off, satu dan nol. \nKomputer harus menampilkan informasi dalam bit karena sirkuit elektronik yang dibuat hanya memilki dua keadaan, on atau off. ");
                    kata.insert("Black Box"," adalah Alat atau sebuah proses yang khusus hanya dalam batas proses \ninput dan output. Kita tidak mengetahui apa yang terjadi di dalam. ");
                    kata.insert("Black Hat"," adalah Hacker jahat, Hacker black hat ini juga biasa disebut sebagai \"aka crackers\"  \ndengan kemampuan mencuri data atau merusak sistem yang ada dalam komputer korban. \nKelebihan black hat adalah kemampuannya untuk menghilangkan jejak hingga tidak bisa dilacak \nsiapa sebenarnya pelaku serangan yang terjadi setelah tujuan tertentu mereka terpenuhi. ");
                    kata.insert("Bluetooth"," adalah Teknologi yang diciptakan untuk koneksi wireless jarak dekat (radius 10 meter). \nTeknologi ini menggunakan chip transceiver yang dirangkai pada mobile computer, telepon, dan peralatan portabel lainnya ");
                    kata.insert("Brainware"," adalah Istilah untuk menyatakan manusia sebagai pemakai komputer. Brainware bisa dikategorikan menjadi sistem analis, programmer dan operator");
                    kata.insert("Break", " adalah Perintah untuk menghentikan jalannya program. Biasanya perintah ini dilakukan dengan meneka tombol CTRL + C. ");
                    kata.insert("Break Point"," adalah Beberapa komputer memiliki sebuah sakelar yang akan membuat komputer akan berhenti di  titik tertentu dalam program, sehingga operator dapat memeriksa jalannya program; atau dapat juga dengan jalan meletakkan perintah stop dalam program. Perintah ini dapat dihapus apabila program telah berjalan dengan baik.");
                    kata.insert("Buffer"," adalah Tempat penyimpanan data sementara. Hal ini sering digunakan ketika transmisi data harus mengambil tempat pada kecepatan yang berbeda");
                    kata.insert("Bridge"," adalah Perangkat yang menghubungkan jaringan secara fisik dengan cara menggandeng dua buah LAN yang menggunakan protokol sejenis");
                    kata.insert("Broadcast", " adalah Pengiriman pesan ke seluruh titik dalam suatu jaringan. ");
                    kata.insert("Browse"," adalah Perintah dalam lingkungan Windows untuk menampilkan isi disk. Program aplikasi yang digunakan untuk browsing.");
                    kata.insert("Browsing"," adalah Aktivitas penjelajahan beberapa situs di Internet. ");
                    kata.insert("Byte"," adalah Informasi dengan panjang 8 bit. ");
                    kata.insert("Byte Mode", " adalah Model pengiriman data yang dilakukan dengan cara mentransfernya byte demi byte. ");
                    kata.insert("Cache"," adalah Berasal dari kata cash, dipergunakan untuk meningkatkan kecepatan transfer data baik secara sementara maupun permanen.");
                    kata.insert("Cancel"," adalah Digunakan untuk membatalkan perintah atau menggagalkan kegiatan yang sedang dikerjakan.");
                    kata.insert("Caps lock"," adalah Tombol pada keyboard yang berfungsi mengubah semua tombol huruf menjadi huruf besar.");
                    kata.insert("Caption"," adalah Dalam lingkungan pengolah kata Ms-Word perintah ini digunakan untuk menambahkan keterangan pada sebuah gambar, tabel atau obyek lainnya.");
                    kata.insert("Catalog"," adalah Perintah dalam DOS untuk menampilkan daftar file yang berada dalam sebuah disk.");
                    kata.insert("CD","(Carrier Detect) : Status modem jika sedang terhubung dengan modem lain.");
                    kata.insert("CD Drive"," adalah Suatu drive untuk merekam atau memainkan Compact Disk, yang sering dijumpai adalah CD-ROM (CD Read Only Memory) MO (Magneto-Optical) dan WORM (Write Once Read Many).");
                    kata.insert("CD ROM"," (Compact Disc Read Only Memory) : Compact Disk yang tidak bisa dipakai untuk menulis ulang (dihapus atau ditambah); digunakan dalam penyimpanan data komputer. ");
                    kata.insert("CD RW"," adalah Sebuah Compact Disk yang selain dapat dipakai untuk dibaca juga dapat digunakan untuk menyimpan data dengan menulisnya menggunakan CD-RW Drive");
                    kata.insert("CD Title"," adalah Compact Disc yang berisi program-program komputer.");
                    kata.insert("CDMA"," (Code Division Multiple Access) : Teknologi interface spread spectrum udara yang digunakan pada beberapa ponsel dan jaringan wireless lainnya. ");
                    kata.insert("Chace"," adalah Sebutan untuk kartu grafik seperti VGA card.");
                    kata.insert("Chaining"," adalah Proses kerja komputer yang bersambung dalam serangkaian segmen. Apabila sebuah program terlalu besar masuk dalam memori, program harus ditulis dalam beberapa segmen. Komputer akan bekerja dalam satu segmen setiap satu waktu sampai selesai, hasilnya akan dibawa ke segmen berikutnya. Demikian seterusnya sampai program selesai diolah.");
                    kata.insert("Channel"," adalah Saluran untuk mengirimkan sinyal elektromagnetik yang mampu menghubungkan CPU dengan peralatan lainnya.");
                    kata.insert("Chat"," adalah Layanan percakapan online yang biasa digunakan pengguna Internet untuk berbicara dengan pengguna lain");
                    kata.insert("CHDIR", " adalah Perintah untuk pindah atau mengaktifkan direktori dalam lingkungan sistem operasi DOS.");
                    kata.insert("CHIP", " adalah Bit kecil dari silikon yang merupakan inti dari sebuah IC (Integrated Circuit) atau sebutan untuk IC itu sendiri.");
                    kata.insert("Chipset"," adalah Chips atau chipset merupakan potongan-potongan kecil silikon yang digunakan untuk menyimpan informasi dan instruksi komputer. Setiap komponen komputer memiliki paling tidak sebuah chip di dalamnya. Chipset pada motherboard mengontrol masukan dan keluaran (input dan output) yang mendasar dari komputer. Chipset pada video card mengontrol rendering dari grafik 3D dan output dari gambar pada monitor anda. CPU merupakan salah satu contoh chip yang sangat penting. Chipset motherboard misalnya BX, i810, i820, dan banyak lagi lainnya.");
                    kata.insert("Circuit Board", " adalah Sebuah papan sirkuit lengkap dengan komponen elektronik yang diletakkan dan disolder pada tempatnya.");
                    kata.insert("Click", " adalah istilah untuk mewakili pemilihan obyek atau menu dengan menekan salat satu tombol mouse.");
                    kata.insert("Client"," adalah Pada jaringan, client adalah sebuah software aplikasi yang memungkinkan pengguna untuk mengakses servis atau layanan dari komputer server.");
                    kata.insert("Client Server", " adalah Suatu bentuk arsitektur dimana client adalah perangkat yang menerima yang akan menampilkan antarmuka pemakai dan menjalankan aplikasi (komputer ) dan server adalah perangkat yang menyediakan dan bertindak sebagai pengelola aplikasi, data dan keamanannya (server atau mainframe). ");
                    kata.insert("Data"," adalah Kumpulan dari angka-angka maupun karakter-karakter yang tidak memilii arti. Data dapat diolah sehingga menghasilkan informasi.");
                    kata.insert("Database"," adalah Sekumpulan file yang saling terkait dan membentuk suatu bangun data. Databaseminimal terdiri dari satu file yang cukup untuk dimanipulasi oleh komputer sedemikian rupa. ");
                    kata.insert("Database Administrator"," adalah Orang yang bertugas untuk mendefinisikan pola struktur database, menentukan metode akses dan penyimpanan, berwenang memberikan ijin pengaksesan data pada pengguna, dan lain sebagainya.");
                    kata.insert("Database Information Utility"," adalah Layanan penyediaan informasi yang ditawarkan sebuah basis data jaringan sehingga pengguna jaringan bisa mendapatkan laporan informasi yang diinginkan.");
                    kata.insert("Database Management"," adalah Pengelolaan data dalam suatu basis data, cara memasukkan data dalam database, memperbaharuinya dan menyajikan informasi dari data tersebut.");
                    kata.insert("Decision Support System"," adalah Salah satu sistem informasi berbasis komputer yang menyajikan informasi secara khusus bagi pihak manajemen untuk mendukung pengambilan keputusan.");
                    kata.insert("Declaration"," adalah Proses pengenalan tipe data suatu variabel kepada kompiler sehingga akan diketahui berapa banyak memori yang harus disiapkan untuk masing-masing variabel.");
                    kata.insert("DECnet"," adalah Sekelompok protokol jaringan buatan Digital Equipment Corporation yang khusus digunakan pada computer buatan DEC untuk berkomunikasi.");
                    kata.insert("DECNET", " adalah Software jaringan khusus untuk komputer digital yang mirip dengan OSI. DECNET memiliki kemampuan menjadi bagian dari jaringan yang memakai standard X.25 atau IBM SNA.");
                    kata.insert("OSI", " adalah Protokol DECnet yang kompatibel dengan phase V produk Digital Network Architecture (DNA). Protocol ini mendukung sistem terbuka OSI.");
                    kata.insert("Decreament"," adalah Untuk mengurangi nilai suatu variabel satu demi satu.");
                    kata.insert("Decompress"," adalah Mengembalikan file-file yang telah dimampatkan (compress) ke keadaan semula.");
                    kata.insert("Default"," adalah Hasil penyetelan tetap untuk menjalankan sebuah program atau aplikasi");
                    kata.insert("Demodulation"," adalah Proses mengubah sinyal analog menjadi bentuk digital.");
                    kata.insert("Desktop"," adalah Salah satu model kemasan komputer yang sengaja dirancang untuk ditempatkan di atas meja kerja.");
                    kata.insert("Desktop Publishing"," adalah Software yang digunakan untuk membuat dan mengatur format pada pencetakkan majalah dan buku secara mudah. Contoh software DTP adalah Ventura dan Pagemaker.");
                    kata.insert("Dial"," adalah Proses terhubungnya komputer ke suatu stasiun atau sebuah alamat Internet melalui saluran komunikasi.");
                    kata.insert("Dial Line"," adalah Istilah lain untuk menyebutkan penghubung saluran (switch connection).");
                    kata.insert("Dial Up", " adalah jenis komunikasi yang menggunakan modem dan saluran telepon biasa untuk bisa berhubungan antara komputer yang satu dengan komputer yang lain, atau bisa juga berarti provider Internet yang memanfaatkan saluran telepon sebagai saluran utamanya. Hubungan ini hanya bersifat sementara.");
                    kata.insert("Dial Up Line", " adalah Jalur komunikasi yang digunakan pada proses dial up, terutama jaringan umum atau jaringan telepon biasa.");
                    kata.insert("DIR", " adalah Dalam sistem operasi DOS berarti perintah untuk menampilkan daftar semua file dalam disk aktif ke layar.");
                    kata.insert("Dial Up Terminal", " adalah Sebuah terminal pada saluran pemindah.");
                    kata.insert("Disconnect", " adalah Istilah untuk menyatakan pemutusan hubungan dengan saluran komunikasi atau keadaan tidak terhubung dengan jaringan manapun.");
                    kata.insert("Disconnect time-out"," adalah Batas waktu yang digunakan oleh switched network untuk melakukan pemutusan hubungan komunikasi apabila sebuah stasiun dalam keadaan tidak aktif melebihi batas waktu tersebut.");
                    kata.insert("Discreate Circuitry"," adalah Membangun sirkuit elektronik dengan memasang beberapa bagian secara individual. Kebalikan dari IC, dan saat ini discreate circuitry jarang dipakai karena mahal dan kurang handal.");
                    kata.insert("Disk", " adalah Piringan tipis yang dilapisi bahan magnetik (oksida besi) yang mampu menyimpan sejumlah data atau informasi. Pembacaan dan penulisan informasi dipusatkan pada track.");
                    kata.insert("Disk Cleaner", " adalah Disket yang membersihkan head suatu disk drive");
                    kata.insert("Diskcopy", " adalah Program under DOS yang berfungsi untuk menyalin keseluruhan isi suatu disk dengan jenis drive yang sama.");
                    kata.insert("Disk Drive", " adalah Alat tambahan yang digunakan untuk meletakkan piringan magnetik, memutar piringan dan menggerakkan head baca/tulis pada posisi yang diinginkan ketika mengakses informasi dari dalam disk");
                    kata.insert("Diskette"," adalah Piringan magnetik tipis, lentur dan dibungkus dalam kemasan berbentuk kotak dari bahan plastik, digunakan untuk menyimpan sejumlah data/informasi. Disket umumnya berukuran 3½ inchi.");
                    kata.insert("Display"," adalah Hardware yang menyajikan hasil keluaran komputer dalam bentuk visual.");
                    kata.insert("Documentation"," adalah Dokumentasi yang menyimpan deskripsi tertulis sebuah program termasuk nama program, fungsi program, masukan/keluaran yang dibutuhkan, kemungkinan ditulis dalam algoritma, bagaimana struktur datanya, dan sebagainya.");
                    kata.insert("Domain"," adalah Definisi dari alamat di Internet, yang juga merujuk ke sebuah negara di mana situs web tersebut digunakan. Misalnya co.id untuk Indonesia. Sedangkan co atau com untuk lembaga komersial dan net untuk lembaga yang berhubungan dengan Internet.");
                    kata.insert("Domain Name"," adalah Bagian dari URL atau alamat situs yang menunjukkan kepemilikan, misalnya andinomaseleno.com menunjukkan alamat itu dimiliki oleh andinomaseleno.");
                    kata.insert("Drag"," adalah Istilah yang menggambarkan kegiatan menggerakkan mouse sambil tetap menekam tombol mouse");
                    kata.insert("Drag and Drop"," adalah Istilah yang menggambarkan kegiatan memilih suatu obyek dan menggerakkan mouse ke lokasi baru sambil tetap menekan tombol mouse sebelah kiri (drag), kemudian meletakkan obyek di lokasi tersebut (drop).");
                    kata.insert("Duplex"," adalah 1. Jalur Komunikasi yang mampu melakukan pengiriman data dua arah. 2. Sistem komputer yang menggunakan 2  CPU yang saling terhubung. ");
                    kata.insert("Duplexed System"," adalah Lingkungan komunikasi data yaitu sistem yang memiliki dua alat yang berbeda dan tidak saling mempengaruhi. Setiap alat mampu melaksanakan fungsinya; ada kemungkinan salah satu alat akan dianggap sebagai cadangan.");
                    kata.insert("EFT"," (Electronic Funds Transfer) : Teknik pengiriman atau pertukaran data-data transaksi keuangan secara elektronik.");
                    kata.insert("Eject"," adalah Perintah yang diberikan pada printer untuk menempatkan kertas di awal halaman. Apabila saat ini posisi kertas berada di tengah, maka sisa halaman akan diabaikan dan meletakkan kertas berikutnya di awal halaman.");
                    kata.insert("E-mail"," adalah Surat-menyurat melalui internet.Pengguna dapat saling bertukar berita. Berita-berita itu akan dikumpulkan dalam sebuah file untuk pengalamatan yang berupa mailbox, sehingga pengguna dapat membaca berita yang ditujukan kepadanya kapan saja.");
                    kata.insert("E-mail Address"," adalah Alamat yang dipakai pada proses pengiriman e-mail ke tujuannya. Alamat tersebut dibuat berdasarkan DNS.");
                    kata.insert("E-mail Virus"," adalah Virus yang dikirimkan sebagai file lampiran pada e-mail, virus baru akan bekerja dan menginfeksi jika kita membuka file attachment tersebut. Sebagian besar adalah virus Macro yang menyerang aplikasi Microsoft Word, biasanya file virus tersebut berekstensi .exe. Contohnya seperti virus Worm.ExploreZip.");
                    kata.insert("Encode"," adalah Kegiatan mempersiapkan suatu rutin program ke dalam bahasa mesin sehingga dapat segera dilaksanakan oleh komputer.");
                    kata.insert("Encoder"," adalah Suatu sistem komputer atau sistem jaringan yang hanya mampu menerima satu masukan saja, yang setiap masukan akan menghasilkan beberapa kombinasi hasil keluaran. ");
                    kata.insert("Encryption"," adalah Penerjemahan data menjadi kode rahasia. Enkripsi adalah cara yang paling efektip untuk memperoleh pengamanan data. Untuk membaca file yang di-enkrip, kita harus mempunyai akses terhadap kata sandi yang memungkinkan kita men-dekrip pesan tersebut. Data yang tidak di-enkrip disebut plain text, sedangkan yang di-enkrip disebut cipher text");
                    kata.insert("End", " adalah Tombol pada keyboard, berfungsi untuk menggerakkan kursor ke akhir baris.");
                    kata.insert("Error", " adalah Istilah untuk menunjukkan bahwa terdapat suatu penyimpangan dalam software atau kerusakan hardware");
                    kata.insert("Ethernet"," adalah Sebuah standar LAN meliputi kabel dan skema protokol komunikasi yang dikembangkan oleh Xerox Corporation. Sekarang Ethernet menjadi protokol yang banyak digunakan dan diadaptasi oleh perusahaan lain. ");
                    kata.insert("Ethernet Cabel", " adalah Semua kabel media untuk jaringan Ethernet. Contoh Ethernet cable yaitu kabel jenis 10base5, UTP/STP. ");
                    kata.insert("Ethernet Meltdown",  " adalah Peristiwa yang menimbulkan kejenuhan di Ethernet, disebabkan oleh masuknya paket-paket data tak resmi. Peristiwa ini hanya berlangsung dalam waktu singkat.");
                    kata.insert("Ether Talk", " adalah Paket-paket AppleTalk terenkapsulasi yang dilewatkan pada kabel Ethernet.");
                    kata.insert("Eudora"," adalah Program aplikasi layanan e-mail di Internet.Facsimile : Alat pengirim dokumen atau gambar dari satu tempat ke tempat lain dengan menggunakan saluran telepon. Pengiriman bisa dilakukan apabila pengirim dan penerima sama-sama mengaktifkan mesin ini. ");
                    kata.insert("Fading"," adalah Gangguan saluran transmisi, terutama pada sistem gelombang mikro ketika sinyal-sinyal yang dikirim melalui berbagai jalur ke penerima mengalami perubahan karena kondisi atmosfir.");
                    kata.insert("Failure"," adalah Pernyataan yang menunjukkan bahwa alat terkait tidak berjalan dengan semestinya.");
                    kata.insert("Female Connector"," adalah Sebuah plug atau socket yang memiliki receptacles. Lawannya adalah \"konektor pria\" yang memiliki pin");
                    kata.insert("Fetch", " adalah Program software untuk memindahkan file yang dikembangkan oleh Dartmouth College untuk Macintosh. Program ini menyediakan akses ke FTP yang bersifat user friendly.");
                    kata.insert("File", " adalah File terdiri dari sekumpulan record-record yang saling berhubungan. Setiap record memiliki nomor yang disesuaikan dengan posisinya dalam file.");
                    kata.insert("Folder"," adalah Pada lingkungan Graphical User Interface (GUI) seperti Windows dan Macintosh, folder adalah suatu objek yang dapat berisi beberapa dokumen. Folder digunakan untuk menata informasi. Pada DOS dan UNIX, folder disebut direktori (directory).");
                    kata.insert("Gigabyte"," adalah Suatu istilah untuk menyebutkan suatu citra yang memiliki warna abu-abu, alias hitam dan putih. Greyscale menunjukkan jumlah warna (dari abu-abu, hingga hitam – putih) yang ada dalam satu citra. Makin besar angka Grayscale, citra yang terbentuk makin mendekati kenyataan.");
                    kata.insert("Gigacycle"," adalah Satuan ukuran frekuensi dengan 1 Gigacycle = 1 milyar Hertz.");
                    kata.insert("Google", " adalah Nama search engine di Internet.");
                    kata.insert("Glossary"," adalah Daftar istilah berikut penjelasan pengertian istilah-istilah tersebut.");
                    kata.insert("Gopher"," adalah Suatu sistem informasi berbasis menu dalam Internet yang populer karena kemampuannya berhubungan dalam situs gopher yang lain dalam menu yang sama.");
                    kata.insert("GPRS", " (General Packet Radio Service ) :\n" + "Layanan komunikasi berbasis paket, tanpa kabel sebagai media komunikasi. Layanan ini diperuntukkan bagi komputer jinjing (notebook). Dasar dari GPRS adalah komunikasi GSM (Global System for Mobile Communication). Kecepatan yang ditawarkan mulai dari 56 Kbps sampai dengan 114 Kbps, memungkinkan untuk mengakses Internet dengan lebih cepat. ");
                    kata.insert("GSM"," (Global System for Mobile Communication) : Seluler digital atau standar PCS yang digunakan di seluruh dunia. GSM merupakan standar yang paling banyak digunakan di Eropa dan Asia Tenggara. ");
                    kata.insert("Guestbook"," adalah Fasilitas interaktif dalam sebuah halaman web yang mengizinkan pengunjungnya untuk menulis pesan.");
                    kata.insert("Homepage"," adalah Halaman pertama dari suatu Web Site.");
                    kata.insert("Host", " adalah Istilah yang digunakan untuk menunjuk sebuah komputer yang memungkinkan penggunanya terhubung ke Internet.");
                    kata.insert("Host Name"," adalah Nama dari komputer dalam Internet, digunakan untuk menunjukkan skema penamaan URL.");
                    kata.insert("HTTP", " (Hyper Text Transfer Protocol) : Sebuah metode atau protokol untuk mendowload file ke komputer. Protokol ini berbasis hyper text, sebuah format teks yang umum digunakan di Internet. ");
                    kata.insert("Icon", " adalah Tipe GIF Spesial yang memungkinkan tampilan gambar tersebut dimunculkan sedikit demi sedikit ketika sebuah halaman web sedang didownload. ");
                    kata.insert("Internet", " adalah Istilah umum yang dipakai untuk menunjuk Network tingkat dunia yang terdiri dari komputer dan layanan servis atau sekitar 30 sampai 50 juta pemakai komputer dan puluhan sistem informasi termasuk e-mail, Gopher, FTP dan World Wide Web.");
                    kata.insert("Internet Device", " adalah Alat canggih seperti komputer yang dipergunakan untuk dapat berkomunikasi atau berinteraksi melalui Internet, baik untuk surfing, mengirim dan menerima e-mail, bahkan untuk ber-chatting, baik menggunakan teks, suara, gambar maupun video, misal : notebook, palmtop, handphone, Internet-TV.");
                    kata.insert("Internet Explorer"," adalah Suatu browser Web gratis terkenal yang diproduksi oleh Microsoft.");
                    kata.insert("Intranet", " adalah Sumber daya informasi yang digunakan untuk kepentingan internal dari suatu instansi atau perusahaan dengan menggunakan jaringan komputer yang ada.");
                    kata.insert("Java", " adalah Bahasa pemrograman untuk menciptakan isi yang aktif dalam halaman Web, juga dapat dijalankan dalam semua komputer. Applet Java diambil/diakses dari halaman Web dan dijalankan secara total. ");
                    kata.insert("JavaScript"," adalah Bahasa script interpreter untuk menciptakan isi yang aktif dalam halaman Web.");
                    kata.insert("JPEG"," (Joint Photographic Expert Group) :\n" + "Format file yang memuat data berupa gambar. Gambar JPEG terkompresi secara lossy, sehingga kualitas gambar diturunkan untuk mendapatkan ukuran file yang kecil. Walaupun demikian perbedaan kualitas tersebut tidak akan dapat terlihat untuk gambar-gambar tertentu. JPEG biasanya digunakan untuk gambar-gambar yang tidak jelas batas warnanya, seperti foto, lukisan, dll. ");
                    kata.insert("Kbps", " adalah Kilobytes per second.");
                    kata.insert("KHz"," adalah Satuan unit frekuensi yang sama dengan 1000 siklus per detik. ");
                    kata.insert("Konektor Power"," adalah Pin yang menyambungkan motherboard dengan power supply di casing sebuah komputer. Pada motherboard tipe AT, casing yang dibutuhkan adalah tipe AT juga. Konektor power tipe AT terdiri dari dua bagian, dimana dua kabel dari power supply akan menancap. Pada tipe ATX, kabel power supply menyatu dalam satu header yang utuh sehingga tinggal menancapkannya di motherboard. Kabel ini terdiri dari dua kolom sesuai dengan pin di motherboard yang terdiri atas dua larik pin juga. Ada beberapa motherboard yang menyediakan dua tipe konektor power, AT dan ATX. Kebanyakan motherboard terbaru sudah bertipe ATX.");
                    kata.insert("LAN"," adalah Sebuah jaringan yang dibangun pada sebuah lokasi seperti di rumah ataupun gedung perkantoran. Bisa diartikan juga sebagai sebuah sistem komunikasi komputer yang jaraknya dibatasi tidak lebih dari beberapa kilometer dan menggunakan koneksi high-speed antara 2 hingga 100 Mbps. ");
                    kata.insert("Layer", " adalah Lapisan (konsep) dalam networking. Berbagai model komunikasi seperti OSI dan TCP/IP terdiri atas beberapa layer yang menyusun protokol tersebut.");
                    kata.insert("LCD", " (Liquid Crystal Display) : Jenis tampilan layar yang menggunakan persenyawaan cair yang mempunyai struktur molekul polar, diapit antara dua elektroda yang transparan. Bila medan listrik diberikan, molekul menyesuaikan posisinya pada medan, membentuk susunan kristalin yang mempolarisasi cahaya yang melaluinya. ");
                    kata.insert("LED"," (Light Emitting Diode) : Sebuah lampu kecil yang digunakan sebagai penanda atau pointer. ");
                    kata.insert("Link", " adalah Sambungan atau koneksi dari sebuah sumber ke sumber yang lain. Misalnya dalam sistem networking atau Internet.");
                    kata.insert("Listserv", " adalah Software manajemen mailing list.");
                    kata.insert("Load Time"," adalah Waktu yang dibutuhkan untuk mengambil/membuka halaman Web pada komputer.");
                    kata.insert("Locate", " adalah Perintah yang digunakan dalam Linux/Unix untuk mendapatkan file tertentu. Hanya saja perintah locate ini harus didahului dengan slocate untuk melakukan updating informasi file dalam host tersebut.");
                    kata.insert("Localhost", " adalah Di dunia Networking, Localhost merupakan istilah yang digunakan untuk host itu sendiri. Nama localhost digunakan untuk konfigurasi aplikasi sebelum benar - benar mendapatkan hostname dari hostmasternya.");
                    kata.insert("Log", " adalah Catatan yang merekam segala aktifitas suatu aplikasi dijalankan. terkadang Log juga digunakan untuk menganalisa status suatu aplikasi.");
                    kata.insert("Login", " adalah Keluar atau menutup, sama artinya dengan sign out. Multiuser systemSebarang sistem komputer yang dapat dipakai oleh lebih dari satu orang.");
                    kata.insert("Modem", " adalah Singkatan dari modulator/demodulator; alat komunikasi yang memungkinkan komputer mengirimkan informasi melalui saluran telepon piawaian");
                    kata.insert("Motherboard"," adalah Komponen terbesar di dalam PC. Disebut ‘mother’ karena papan ini menjadi tempat seluruh komponen PC seperti prosesor, memori utama, rangkaian pendukung dan bus controller.");
                    kata.insert("MPEG Card", " adalah : Kependekan dari Motion Picture Expert Group. Yaitu card yang melengkapi CD-ROM agar mampu menampilkan full motion video secara mulus, satu full motion video harus dijalankan pada kecepatan 30 frame per detik (fps). Dengan memasang MPEG card dan CD-ROM drive di PC, kita boleh menonton film CD maupun berkaraoke di PC. ");
                    kata.insert("MMX/ Microprocessor Multimedia Exstensions"," adalah Prosesor Pentium generasi baru yang dapat mendongkrak kinerja multimedia dan komunikasi sampai 60% di atas pentium. Secara umum MMX membuat game/ permainan lebih realistik, video lebih baik dan fasiliti grafik lebih sempurana.");
                    kata.insert("Offline"," adalah Status dimana suatu alat tidak dapat berkomunikasi dengan atau dikontrol oleh komputer.");
                    kata.insert("Online", " adalah Aktif dan siap untuk operasi, dapat berkomunikasi dengan atau dikontrol oleh komputer.");
                    kata.insert("Postcript Page Description Language"," adalah Bahasa pemrograman yang khusus untuk mendefinisikan tampilan dokumen, biasanya menyediakan kapabilitas huruf yang fleksibel dan grafik dengan kualitas tinggi.");
                    kata.insert("Plotter"," adalah Alat untuk menggambar grafik, diagram dan grafik garis lainnya yang menggunakan pena atau muatan elektrostatik dan toner.");
                    kata.insert("Pentium", " adalah Sebutan untuk prosesor Intel 80586 disebut juga P5. Prosesor Pentium berasaskan operasi 64-bit dan memiliki 3.1 juta buah transistor.");
                    kata.insert("Pentium Pro", " adalah Sebutan untuk prosesor Intel 80686 disebut juga P6. Yaitu prosesor berasaskan operasi 64-bit dan memiliki 5.5 juta buah transistor. Sasaran pasar umumnya untuk komputer jaringan dengan sistem operasi Windows NT (New Technology).");
                    kata.insert("Peripheral", " adalah Istilah dalam komputer yang digunakan untuk peralatan seperti penggerak disik, printer, modem dan lainnya yang dihubungkan ke komputer dan dikendalikan oleh prosesornya.");
                    kata.insert("Prosesor"," adalah Disebut juga unit pemrosesan pusat chip tunggal, yaitu alat yang menterjemahkan dan melaksanakan instruksi-instruki yang melaluinya, atau alat yang berfungsi sebagai otak komputer.");
                    kata.insert("Pixel/ Picture element"," adalah Unsur terkecil yang ditampilkan atau dicetak yang dapat ditangani oleh hardware dan software untuk membentuk huruf, angka atau grafik. Atau suatu titik kisi-kisi yang terdiri dari ribuan titik satu per satu untuk membentuk suatu gambar pada layar oleh komputer atau pada kertas printer.");
                    kata.insert("Port"," adalah Soket, sejenis stopkontak pada hardware komputer, disebut juga konektor input/ output; yaitu tempat untuk meneruskan data masuk dan keluar dari alat komputasi melalui kabel.");
                    kata.insert("Power Supply"," adalah Alat yang mengubah listrik dari soket listrik menjadi tegangan yang lebih rendah (khususnya 5 sampai 12 volt DC) yang dibutuhkan oleh sistem komputer.");
                    kata.insert("Query"," adalah Proses pengambilan data dari suatu asas data dan menyediakannya untuk dipakai atau suatu himpunan tertentu yang berisi instruksi untuk mengambil data tertentu secara berulang.");
                    kata.insert("Real time"," adalah Operasi real time adalah lingkungan di mana aktiviti mesin sesuai dengan persepsi manusia mengenai waktu atau di mana operasi komputer berjalan dengan kecepatan dengan proses fizikal atau eksternal.");
                    kata.insert("Resolution/ Resolusi"," adalah Kejernihan atau kehalusan detil yang diperoleh monitor atau printer dalam menghasilkan gambar. Resolusi biasanya dipakai untuk menunjukkan jumlah total pixel yang ditampilkan secara horisontal atau vertikal pada tampilan video.");
                    kata.insert("Router"," adalah Alat perantara pada jaringan komunikasi yang melancarkan pengiriman pesan. ");
                    kata.insert("Scan"," adalah Menggerakkan alat peka cahaya sepanjang permukaan yang ditempati gambar seperti halaman teks, mengkonversi berbagai bidang pada permukaan menjadi digit biner yang dapat diinterpretasi oleh komputer.");
                    kata.insert("Spreadsheet program"," adalah Paket program komputer yang digunakan untuk memproses data keuangan dan data lain yang berhubungan dengan angka seperti anggaran, analisa cash flow, dan sebagainya.");
                    kata.insert("Shareware"," adalah Program yang boleh digunakan secara terhad untuk jangka waktu percobaan tertentu.");
                    kata.insert("SRAM/ Static RAM"," adalah Chip RAM yang dapat menyimpan sekitar seperempat data pada chip DRAM tetapi jauh lebih cepat dari pada DRAM. Harganya masih mahal.");
                    kata.insert("Stack"," adalah Daerah memori yang dicadangkan dimana program menyimpan data status, seperti prosedur dan fungsi yang memanggil return address, meneruskan parameter, dan (kadang-kadang) variabel setempat.");
                    kata.insert("Storage"," adalah Suatu alat yang secara fisik dapat digunakan menyimpan data atau informasi mengenai fail/ arsip dan dapat dibaca komputer.");
                    kata.insert("SIMM"," adalah Singkatan dari Single In-line Memory Module. Papan rangkaian kecil yang dirancang untuk menempati chip/IC memori.");
                    kata.insert("SCSI/Small Computer System Interface"," adalah Interface paralet dengan tahap kecepatan tinggi yang digunakan untuk menghubungkan komputer ke alata lainnya seperti harddisk, printer, atau ke komputer lain secara jaringan.");
                    kata.insert("Serial port"," adalah Konektor/ soket untuk lokasi input/output untuk transmisi data serial seperti printer atau mouse.");
                    kata.insert("Sound clip"," adalah Koleksi suara pada sebuah disk yang dapat diambil dan digabungkan ke dalam dokumen dengan bantuan software atau hardware tertentu.");
                    kata.insert("Token Ring"," adalah Struktur objek data yang unik atau pesan yang berkeliling secara bersambung di antara node-node suatu jaringan yang bertopologi gelang (topologi tertutup, ring) dan menggambarkan status yang ada di jaringan.");
                    kata.insert("Universal Serial Bus/ USB"," adalah Kombinasi hardware, software dan kabel listrik yang menghasilkan suatu cara berkomunikasi antara semua bagian komputer yang berlainan secara universal, satu per satu.");
                    kata.insert("Validasi"," adalah Pengujian untuk mengukur persesuaian dengan piawaian .");
                    kata.insert("Visual Image"," adalah Deskripsi gambar yang disimpan dan dirakam dengan berbagai cara dan merupakan suatu salinan atau reproduksi yang diedit untuk sebuah citra di komputer.");
                    kata.insert("Video Card"," adalah Card yang dapt mengubah data analog dari kamera, VCR, laser disc, maupun televisi menjadi data digital, sehingga dapat disimpan di harddisk. Selanjutnya data video diolah oleh komputer dan hasilnya dapat ditampilkan di layar komputer, pesawat TV, atau dirakam ke kaset video.");
                    kata.insert("VGA/ Video Graphic Array"," adalah Merupakan video adapter yang diperkenalkan oleh IBM pada 1987, yang menduplikasikan sampel suatu variabel fisik, seperti suara. Makin tinggi samping rate atau makin banyak sampel diambil persatuan waktu, makin rapat hasil digitasi menyerupai aslinya.");
                    kata.insert("Wavetable synthesizer"," adalah Sistem yang berdiri sendiri, membangkitkan suara digital yang bukan karena manipulasi alat fisik atau rekaman suara dan dapat menghasilkan suara yang realistis tanpa gangguan.");
                    kata.insert("WORM/ Write Once, Read Many"," adalah Jenis disk optik yang dapat dan dibaca ulang tetapi tidak dapat diubah setelah dirakam dengan ruang penyimpanan kapasiti tinggi.");
                    kata.insert("Worksheet"," adalah Istilah yang digunakan untuk menggambarkan fail data yang dibentuk dan dipakai oleh dan dengan program lembar kerja elektronik. Contoh MS Excel");
                    kata.insert("Xing MPEG Software"," adalah Program yang dapat memainkan aplikasi MPEG berupa filem-filem dalam media ");
                    kata.insert("ZIP"," adalah Extensi/Sambungan ada nama fail yang mengindikasikan bahwa fail tersebut sudah dikompres oleh program PKZIP. Contoh motor.zip");

                  break;         
               case '2':
                  System.out.print("\n   Key = ");
                  key = getString();
                  System.out.println("   Value is " + kata.getValue(key));
                  break;         
               case '3':
                  System.out.print("\n   Key = ");
                  key =getString();
                  System.out.println("   FindKey(" + key + ") is " 
                                               + kata.FindKey(key));
                  break;              
               case '4':
                  kata.display();
                  break; 
               default:
                  System.out.println("   Illegal command.");
                  break;
            }
            System.out.println("\nHash table size is " + kata.size());
         }
      }
    public static String getString() throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String s=br.readLine();
        return s;
    }
    public static char getChar() throws IOException{
        String s=getString();
        return s.charAt(0);
    }
    
    public static int getInt() throws IOException{
        String s=getString();
        return Integer.parseInt(s);
    }

   } // end class TestHashTable


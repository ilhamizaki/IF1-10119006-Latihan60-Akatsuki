/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ilham;

/**
 *
 * @author 
 * NAMA     : Ilham zaki
 * Kelas    : IF1
 * NIM      : 10119006
 * Deskripsi Program : class induk Character Akatsuki untuk menampilkan 
 *                     dan pilih karakter
 */
public class Character {
    
    public void tampilKarakter(String[] nama) {
        for (String nama1 : nama) {
            System.out.println(nama1);
        }
    }
    
    public void pilihKarakter(byte pilih) {
        switch (pilih) {
            case 1 :
                System.out.println("\n====== Hidan ======");
                System.out.println("Hidan memang memiliki kemampuan untuk abadi selama kepalanya tidak hancur.\n" +
                                    "Masalahnya dia bukan petarung yang hebat dan tetap membutuhkan bantuan \n" +
                                    "Kakuzu atau orang lain dalam bertarung.\n" + "\n" +
                                    "Kalau ada petarung cepat yang memutilasi Hidan dan tidak ada yang \n" +
                                    "membantunya menyambungkan tubuhnya, maka bisa kita lihat sendiri \n" +
                                    "hasilnya seperti pertarungan Shikamaru melawan Hidan.");
                break;
                
            case 2 :
                System.out.println("\n====== Kakuzu ======");
                System.out.println("Berbeda dengan Hidan, tidak hanya \"hampir\" abadi, Kakuzu juga ahli dalam bertarung.\n" + "\n" +
                                   "Dia bisa abadi karena mengganti jantungnya dengan jantung orang lain dan \n" +
                                   "total ada lima jantung.\n" + "\n" +
                                   "Selain itu setiap jantungnya juga punya satu elemen alam, sehingga Kakuzu \n" +
                                   "bisa menggunakan lima elemen alam sekaligus.\n" + "\n" +
                                   "Dia sudah hidup sejak era Hashirama dan sempat selamat ketika mencoba \n" +
                                   "membunuh Hashirama (yang tentunya tidak berhasil) sudah menunjukan kekuatannya.");
                break;
                
            case 3 :
                System.out.println("\n====== Itachi ======");
                System.out.println("Salah satu ahli genjutsu dari Akatsuki, dia adalah Itachi Uchiha.\n" + "\n" +
                                   "Kalau membahas kekuatan dari Itachi, sebenarnya tak bisa hanya \n" +
                                   "menyebut genjutsu saja.\n" + "\n" +
                                   "Salah satu kekuatan terhebatnya justru adalah Mangekyou Sharingan yang \n" +
                                   "bisa membuat Amaterasu dan juga Susano'o.\n" + "\n" +
                                   "Susano'o miliknya sendiri menggunakan perisai Yata no Kagami dan \n" +
                                   "pedang Totsuka yang bisa menyegel lawannya.\n" + "\n" +
                                   "Selain itu kekuatan Izanami juga salah satu keunggulan Itachi.");
                break;
                
            case 4 :
                System.out.println("\n====== Kisame ======");
                System.out.println("Kisame sang Monster Tanpa Ekor ini memiliki pasokan chakra yang sangat \n" +
                                   "besar, karena itu Samehada betah dengan Kisame.\n" + "\n" +
                                   "Tak hanya itu, kemampuan teknik air atau Suiton miliknya juga bukan \n" +
                                   "sembarangan.\n" + "\n" +
                                   "Sebagai pengguna pedang, dia mampu mengkombinasikan kekuatannya \n" + 
                                   "dengan Samehada, bahkan dia juga bisa bergabung dengan Samehada dan \n" +
                                   "jadi lebih kuat lagi.");
                break;
                
            case 5 :
                System.out.println("\n====== Zetsu ======");
                System.out.println("Zetsu yang saya maksud di sini adalah gabungan Hitam dan Putih karena jika \n" +
                                   "mereka dihitung secara individu pun tetap dua yang terlemah.\n" + "\n" +
                                   "Mereka bukanlah tipe petarung, mereka lebih tipe pengamat atau mata-mata \n" +
                                   "karena kemampuan mereka yang bisa menyatu dengan alam atau permukaan.\n" + "\n" +
                                   "Zetsu Hitam sendiri ditunjukan memiliki kemampuan bertarung, namun tidak \n" +
                                   "ada apa-apanya jika dibandingkan semua anggota Akatsuki lainnya.");                
                break;
                
            case 6 :
                System.out.println("\n====== Tobi / Obito ======");
                System.out.println("Obito yang menggunakan Rinnegan.\n" + "\n" +
                                   "Pasalnya, Obito dengan Rinnegan mampu mengendalikan Bijuu dan juga \n" +
                                   "dikombinasikan dengan Kamui maka dia menjadi lawan yang sulit.\n" + "\n" +
                                   "Jangan lupa tanpa Rinnegan pun Obito bisa membantu Itachi membantai \n" +
                                   "semua klan Uchiha yang kuat, menandakan kalau Obito dengan kekuatan \n" +
                                   "matanya sendiri juga sudah sangat kuat.\n" + "\n" +
                                   "Belum lagi kalau menghitung Obito yang menjadi Jinchuriki dari Ekor Sepuluh.");
                break;
                
            case 7 :
                System.out.println("\n====== Orochimaru ======");
                System.out.println("Orochimaru adalah mantan anggota Akatsuki. Sebelum ia keluar dari organisasi \n" +
                                   "tersebut, ia merupakan salah anggota yang terkuat di Akatsuki. Bagaimana tidak, \n" +
                                   "Orochimaru saja salah satu dari Sannin Legendaris, tentu saja ia kuat.");
                break;
                
            case 8 :
                System.out.println("\n====== Deidara ======");
                System.out.println("Punya serangan tanah liat dengan ledakan yang besar, memang cukup kuat \n" +
                                   "namun dia petarung jarak jauh.\n" + "\n" +
                                   "Sekali lagi jika dia bertemu petarung jarak dekat seperti Sasuke atau bahkan \n" +
                                   "yang lebih kuat dan cepat dari Sasuke maka Deidara bisa kalah dengan cepat.\n" + "\n" +
                                   "Memang Deidara sempat menyulitkan Sasuke, namun jika dibandingkan \n" +
                                   "anggota Akatsuki utama lainnya akan sedikit berbeda kekuatannya.");
                break;
                
            case 9 :
                System.out.println("\n====== Sasori ======");
                System.out.println("Sasori tidak bisa dikalahkan dengan mudah. \n" +
                                   "Kugutsu milik Sasori memiliki banyak kegunaan dalam bertarung, termasuk \n" +
                                   "racun-racun berbahayanya.\n" + "\n" +
                                   "Selain itu Kugutsu Kazekage Ketiga juga sangat berguna dan \n" +
                                   "tubuh Kugutsu Sasori juga sangat kuat dan cepat.\n" + "\n" +
                                   "Sayangnya kelemahannya terlihat jelas yaitu jantungnya sendiri.");
                break;
                
            case 10 :
                System.out.println("\n====== Konan ======");
                System.out.println("Konan itu salah satu anggota Akatsuki yang kuat. Tak hanya Sasori, dia juga \n" +
                                   "yang mengalahkan Han, Jinchuriki dari Ekor Lima.\n" + "\n" +
                                   "Kemampuan kertasnya sangat berguna dengan baik dalam pertarungan, \n" +
                                   "terutama dia bisa menggunakan kertas peledak dalam jumlah besar juga yang pastinya sangat berbahaya.\n" + "\n" +
                                   "Salah satu yang kuat dari tekniknya juga Konan bisa membuat kertas-kertas \n" +
                                   "yang ia kendalikan jadi tajam.");
                break;
                
            case 11:
                System.out.println("\n====== Pain ======");
                System.out.println("Jika keenam Pain bertarung bersamaan, maka kita lihat hasilnya, satu desa \n" + 
                                   "bisa hancur dan rata dengan tanah.\n" + "\n" +
                                   "Pain atau Nagato dengan Rinnegan seperti paket lengkap tipe-tipe kekuatan \n" +
                                   "mulai dari serangan skala besar sampai kemampuan pendukung \n" + 
                                   "seperti Gakido yang bisa menyerap chakra dalam jumlah besar.\n" + "\n" +
                                   "Ketika menjadi Edo Tensei, Nagato bisa menghilangkan Amaterasu Itachi di \n" +
                                   "seluruh tubuhnya dengan Shinra Tensei.\n" + "\n" +
                                   "Memang harus diakui pemimpin Akatsuki ini punya kekuatan yang sangat besar.");
                break;
                
            case 99 :
                System.out.println("\n====== Peringkat Terkuat ======");
                System.out.println("1. Obito\n" +
                                   "2. Pain\n" +
                                   "3. Itachi\n" +
                                   "4. Kisame\n" +
                                   "5. Orochimaru\n" +
                                   "6. Kakuzu\n" +
                                   "7. Konan\n" +
                                   "8. Sasori\n" +
                                   "9. Deidara\n" +
                                   "10. Hidan\n" +
                                   "11. Zetsu");
                break;
                
        }
    }
}

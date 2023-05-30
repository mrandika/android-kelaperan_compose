package space.mrandika.kelaperan.model

object FoodFactory {
    val foods = listOf(
        Food(
            id = 1,
            name = "Bakso",
            description = "Bakso atau baso adalah jenis bola daging yang lazim ditemukan pada masakan Indonesia.\\n\\nBakso umumnya dibuat dari campuran daging sapi giling dan tepung tapioka, akan tetapi ada juga bakso yang terbuat dari daging ayam, ikan, atau udang bahkan daging kerbau. Dalam penyajiannya, bakso umumnya disajikan panas-panas dengan kuah kaldu sapi bening, dicampur mi, bihun, taoge, tahu, terkadang telur dan ditaburi bawang goreng dan seledri. Bakso sangat populer dan dapat ditemukan di seluruh Indonesia; dari gerobak pedagang kaki lima hingga restoran besar.\\n\\nBerbagai jenis bakso sekarang banyak ditawarkan dalam bentuk makanan beku yang dijual di pasar swalayan ataupun mal-mal. Irisan bakso dapat juga dijadikan pelengkap jenis makanan lain seperti mi goreng, nasi goreng, atau capcai.",
            imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/food_bakso.jpg",
            origin = "Pulau Jawa, Indonesia",
            rating = 4.7,
            galleries = FoodGallery(
                items = listOf(
                    GalleryItem(
                        id = 1,
                        imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/gallery_bakso_1.jpg"
                    ),
                    GalleryItem(
                        id = 2,
                        imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/gallery_bakso_2.jpg"
                    ),
                    GalleryItem(
                        id = 3,
                        imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/gallery_bakso_3.jpg"
                    ),
                    GalleryItem(
                        id = 4,
                        imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/gallery_bakso_4.jpg"
                    )
                )
            )
        ),
        Food(
            id = 2,
            name = "Gudeg",
            description = "Gudeg adalah makanan khas Provinsi Yogyakarta dan Jawa Tengah yang terbuat dari nangka muda yang dimasak dengan santan. Perlu waktu berjam-jam untuk membuat masakan ini. Warna coklat biasanya dihasilkan oleh daun jati yang dimasak bersamaan. Gudeg biasanya dimakan dengan nasi dan disajikan dengan kuah santan kental (areh), ayam kampung, telur, tempe, tahu dan sambal goreng krecek.",
            imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/food_gudeg.jpg",
            origin = "Yogyakarta, Indonesia",
            rating = 4.6,
            galleries = FoodGallery(
                items = listOf(
                    GalleryItem(
                        id = 1,
                        imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/gallery_gudeg_1.jpg"
                    ),
                    GalleryItem(
                        id = 2,
                        imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/gallery_gudeg_2.jpg"
                    ),
                    GalleryItem(
                        id = 3,
                        imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/gallery_gudeg_3.jpg"
                    ),
                    GalleryItem(
                        id = 4,
                        imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/gallery_gudeg_4.jpg"
                    )
                )
            )
        ),
        Food(
            id = 3,
            name = "Kerak Telur",
            description = "Kerak telur adalah makanan asli daerah Jakarta (Betawi), dengan bahan-bahan beras ketan putih, telur ayam atau bebek, ebi (udang kering yang diasinkan) yang disangrai kering ditambah bawang merah goreng, lalu diberi bumbu yang dihaluskan berupa kelapa sangrai, cabai merah, kencur, jahe, merica butiran, garam dan gula pasir.\\n\\nKerak telor dapat ditemukan pada hari biasa. Anda bisa menemukan kerak telor di sekitar Kota Tua, Jakarta Barat. Menurut sejarah, Kerak Telor sudah ada dari zaman kolonial Belanda, kerak telor diciptakan oleh masyarakat Betawi secara tak sengaja Pada tahun 1970an.\\n\\nMakanan ini dihidangkan saat pesta dan hajatan besar para pembesar pada masa itu. Semakin bergulirnya waktu, kehadiran kuliner-kuliner barat menggeser pesona kerak telor ini.",
            imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/food_keraktelor.jpg",
            origin = "Jakarta, Indonesia",
            rating = 4.9,
            galleries = FoodGallery(
                items = listOf(
                    GalleryItem(
                        id = 1,
                        imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/gallery_keraktelor_1.jpg"
                    ),
                    GalleryItem(
                        id = 2,
                        imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/gallery_keraktelor_2.jpg"
                    ),
                    GalleryItem(
                        id = 3,
                        imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/gallery_keraktelor_3.jpg"
                    )
                )
            )
        ),
        Food(
            id = 4,
            name = "Martabak",
            description = "Martabak merupakan sajian yang biasa ditemukan di Arab Saudi (terutama di wilayah Hijaz), Yaman, Indonesia, Malaysia, Singapura, dan Brunei. Bergantung pada lokasinya, nama, dan komposisi martabak dapat bervariasi.\\n\\nDi Indonesia ada dua jenis martabak, yaitu martabak asin/telur yang terbuat dari campuran telur dan daging serta martabak manis, padahal yang benar (kue terang bulan) yang biasanya di isi coklat dan keju. Berbeda dengan martabak telur, martabak manis adalah sejenis kue atau roti isi selai yang biasa dimakan di saat santai sebagai makanan ringan. Di Malaysia, martabak manis (yang dikenal dengan nama Apam Balik) sering dijadikan sebagai hidangan sarapan dengan ditemani segelas teh tarik.",
            imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/food_martabak.jpg",
            origin = "Hijaz, Arab Saudi",
            rating = 4.5,
            galleries = FoodGallery(
                items = listOf(
                    GalleryItem(
                        id = 1,
                        imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/gallery_martabak_1.jpg"
                    ),
                    GalleryItem(
                        id = 2,
                        imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/gallery_martabak_2.jpg"
                    ),
                    GalleryItem(
                        id = 3,
                        imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/gallery_martabak_3.jpg"
                    ),
                    GalleryItem(
                        id = 4,
                        imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/gallery_martabak_4.jpg"
                    )
                )
            )
        ),
        Food(
            id = 5,
            name = "Mie Goreng",
            description = "Mi goreng berarti mi yang digoreng adalah makanan yang berasal dari Indonesia yang populer dan juga digemari di Malaysia, dan Singapura. Mi goreng terbuat dari mi kuning yang digoreng dengan sedikit minyak goreng, dan ditambahkan bawang putih, bawang merah, udang serta daging ayam atau daging sapi, irisan bakso, cabai, sayuran, tomat, telur ayam, dan acar. Makanan ini sangat populer dan dapat ditemui di mana-mana di Indonesia, mulai dari pedagang pinggir jalan (kaki lima) sampai restoran mewah. Mi goreng juga dapat ditemukan di warung mamak di Malaysia dan Singapura. Versi mi instan dari mi goreng juga sangat populer, seperti Indomie Mi goreng.\\n\\nMasakan ini berasal dari Chow mein, mi China, dan dipercaya dibawa oleh para pendatang Cina ke Indonesia, Malaysia, and Singapura. Mi goreng juga mirip dengan Yakisoba dari Jepang. Akan tetapi mie goreng sudah sedemikian rupa terintegrasi ke dalam seni kuliner Indonesia. Sebagai contoh mie goreng membubuhkan kecap manis sebagai bahan penting. Untuk menyesuaikan dengan masyarakat Indonesia yang kebanyakan adalah muslim, mi goreng biasanya tidak menggunakan daging babi maupun lemak babi. Biasanya mi goreng menggunakan udang, daging ayam, atau daging sapi.",
            imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/food_miegoreng.jpg",
            origin = "Guandong, Tiongkok",
            rating = 4.7,
            galleries = FoodGallery(
                items = listOf(
                    GalleryItem(
                        id = 1,
                        imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/gallery_miegoreng_1.jpg"
                    ),
                    GalleryItem(
                        id = 2,
                        imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/gallery_miegoreng_2.jpg"
                    )
                )
            )
        ),
        Food(
            id = 6,
            name = "Nasi Goreng",
            description = "Nasi goreng adalah sebuah makanan berupa nasi yang digoreng dan diaduk dalam minyak goreng, margarin atau mentega, biasanya ditambah kecap manis, bawang merah, bawang putih, asam jawa, lada dan bumbu-bumbu lainnya, seperti telur, ayam, dan kerupuk. Ada pula nasi goreng jenis lain yang dibuat bersama ikan asin yang juga populer di seluruh Indonesia.\\n\\nNasi goreng juga dikenal sebagai masakan nasional Indonesia.[1] Dari sekian banyak hidangan dalam khazanah Masakan Indonesia, hanya sedikit yang dapat dianggap sebagai makanan nasional sejati. Masakan nasional Indonesia ini tidak mengenal batasan kelas sosial. Nasi goreng dapat dinikmati secara sederhana di warung tepi jalan, gerobak penjaja keliling, hingga restoran dan meja prasmanan dalam pesta.",
            imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/food_nasigoreng.jpg",
            origin = "Indonesia",
            rating = 4.4,
            galleries = FoodGallery(
                items = listOf(
                    GalleryItem(
                        id = 1,
                        imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/gallery_nasigoreng_1.jpg"
                    ),
                    GalleryItem(
                        id = 2,
                        imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/gallery_nasigoreng_2.jpg"
                    )
                )
            )
        ),
        Food(
            id = 7,
            name = "Nasi Kuning",
            description = "Nasi goreng adalah sebuah makanan berupa nasi yang digoreng dan diaduk dalam minyak goreng, margarin atau mentega, biasanya ditambah kecap manis, bawang merah, bawang putih, asam jawa, lada dan bumbu-bumbu lainnya, seperti telur, ayam, dan kerupuk. Ada pula nasi goreng jenis lain yang dibuat bersama ikan asin yang juga populer di seluruh Indonesia.\\n\\nNasi goreng juga dikenal sebagai masakan nasional Indonesia.[1] Dari sekian banyak hidangan dalam khazanah Masakan Indonesia, hanya sedikit yang dapat dianggap sebagai makanan nasional sejati. Masakan nasional Indonesia ini tidak mengenal batasan kelas sosial. Nasi goreng dapat dinikmati secara sederhana di warung tepi jalan, gerobak penjaja keliling, hingga restoran dan meja prasmanan dalam pesta.",
            imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/food_nasikuning.jpg",
            origin = "Indonesia",
            rating = 4.9,
            galleries = FoodGallery(
                items = listOf(
                    GalleryItem(
                        id = 1,
                        imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/gallery_nasikuning_1.jpg"
                    ),
                    GalleryItem(
                        id = 2,
                        imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/gallery_nasikuning_2.jpg"
                    )
                )
            )
        ),
        Food(
            id = 8,
            name = "Nasi Padang",
            description = "Nasi Padang adalah nasi putih yang disajikan dengan berbagai macam lauk pauk khas Indonesia. Padang merujuk pada ibu kota provinsi Sumatra Barat, kampung halaman orang Minangkabau. Nasi Padang adalah sebuah hidangan yang disajikan secara lengkap secara prasmanan dengan daging, ikan, sayuran, dan makanan pedas dimakan dengan nasi putih, itu adalah komoditas ekspor paling terkenal dan masyarakat minangkabau mempunyai kontribusi yang besar untuk masakan Indonesia.\\n\\nRestoran Padang biasanya ditandai dengan bangunan bergaya Rumah Gadang (atapnya yang lonjong dan melengkung) dan gaya khas etalasenya. etalase Nasi Padang di depan restoran biasanya terdiri dari piring dan mangkuk yang ditumpuk sedemikian rupa, ditata dan diisi dengan berbagai hidangan.. Restoran Padang, terutama yang kecil-menengah, biasanya memakai nama-nama dalam bahasa Minang.",
            imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/food_nasipadang.jpg",
            origin = "Sumatra Barat, Indonesia",
            rating = 4.4,
            galleries = FoodGallery(
                items = listOf(
                    GalleryItem(
                        id = 1,
                        imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/gallery_nasipadang_1.jpg"
                    ),
                    GalleryItem(
                        id = 2,
                        imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/gallery_nasipadang_2.jpg"
                    ),
                    GalleryItem(
                        id = 3,
                        imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/gallery_nasipadang_3.jpg"
                    ),
                    GalleryItem(
                        id = 4,
                        imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/gallery_nasipadang_4.jpg"
                    )
                )
            )
        ),
        Food(
            id = 9,
            name = "Pempek",
            description = "Pempek atau empek-empek adalah makanan yang terbuat dari daging ikan yang digiling lembut yang dicampur tepung kanji atau tepung sagu, serta komposisi beberapa bahan lain seperti telur, bawang putih yang dihaluskan, penyedap rasa, dan garam. Pempek biasanya disajikan dengan kuah cuka yang memiliki rasa asam, manis, dan pedas. Pempek sering disebut sebagai makanan khas Palembang, meskipun hampir semua daerah di Sumatera Selatan memroduksinya.\\n\\nPempek dapat ditemukan dengan mudah di Kota Palembang; ada yang menjualnya di restoran, ada yang di pinggir jalan, dan pula yang dipikul. Pada tahun 1980-an, penjual biasa memikul satu keranjang penuh pempek sambil berjalan kaki berkeliling menjajakan dagangannya.",
            imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/food_pempek.jpg",
            origin = "Sumatra Sekaran, Indonesia",
            rating = 4.5,
            galleries = FoodGallery(
                items = listOf(
                    GalleryItem(
                        id = 1,
                        imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/gallery_pempek_1.jpg"
                    ),
                    GalleryItem(
                        id = 2,
                        imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/gallery_pempek_2.jpg"
                    ),
                    GalleryItem(
                        id = 3,
                        imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/gallery_pempek_3.jpg"
                    )
                )
            )
        ),
        Food(
            id = 10,
            name = "Rawon",
            description = "Rawon adalah masakan Indonesia berupa sup daging berkuah hitam dengan campuran bumbu khas yang menggunakan kluwek. Rawon, meskipun dikenal sebagai masakan khas Jawa Timur (daerah Arekan), dikenal pula oleh masyarakat Jawa Tengah sebelah timur (daerah Surakarta).\\n\\nDaging untuk rawon umumnya adalah daging sapi yang dipotong kecil-kecil, utamanya adalah bagian sandung lamur. Bumbu supnya sangat khas Indonesia, yaitu campuran bawang merah, bawang putih, lengkuas (laos), ketumbar, kemiri, serai, kunir, cabai, kluwek, garam, serta minyak nabati. Semua bahan ini dihaluskan, lalu ditumis sampai harum. Campuran bumbu ini kemudian dimasukkan dalam kaldu rebusan daging bersama-sama dengan daging. Warna gelap khas rawon berasal dari kluwek. Di luar negeri, rawon disebut sebagai black soup. Rawon disajikan bersama nasi, dilengkapi dengan tauge berekor pendek, telur asin, daun bawang, kerupuk udang, daging sapi goreng (empal), dan sambal.",
            imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/food_rawon.jpg",
            origin = "Jawa Timur dan Jawa Tengah, Indonesia",
            rating = 5.0,
            galleries = FoodGallery(
                items = listOf(
                    GalleryItem(
                        id = 1,
                        imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/gallery_rawon_1.jpg"
                    ),
                    GalleryItem(
                        id = 2,
                        imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/gallery_rawon_2.jpg"
                    )
                )
            )
        ),
        Food(
            id = 11,
            name = "Sate",
            description = "Sate atau satai adalah makanan yang terbuat dari daging yang dipotong kecil-kecil dan ditusuk sedemikian rupa dengan tusukan lidi tulang daun kelapa atau bambu kemudian dipanggang menggunakan bara arang kayu. Sate disajikan dengan berbagai macam bumbu yang bergantung pada variasi resep sate. Daging yang dijadikan sate antara lain daging ayam, kambing, domba, sapi, babi, kelinci, kuda, dan lain-lain.\\n\\nSate diketahui berasal dari Jawa, Indonesia, dan dapat ditemukan di mana saja di Indonesia dan telah dianggap sebagai salah satu masakan nasional Indonesia. Sate juga populer di negara-negara Asia Tenggara lainnya seperti Malaysia, Singapura, Filipina, dan Thailand. Sate juga populer di Belanda yang dipengaruhi masakan Indonesia yang dulu merupakan koloninya.\\n\\nSate adalah hidangan yang sangat populer di Indonesia; dengan berbagai suku bangsa dan tradisi seni memasak (lihat Masakan Indonesia) telah menghasilkan berbagai jenis sate. Di Indonesia, sate dapat diperoleh dari pedagang sate keliling, pedagang kaki lima di warung tepi jalan, hingga di restoran kelas atas, serta kerap disajikan dalam pesta dan kenduri. Resep dan cara pembuatan sate beraneka ragam bergantung variasi dan resep masing-masing daerah. Hampir segala jenis daging dapat dibuat sate. Sebagai negara asal mula sate, Indonesia memiliki variasi resep sate yang kaya. Biasanya sate diberi saus. Saus ini bisa berupa bumbu kecap, bumbu kacang, atau yang lainnya, biasanya disertai acar dari irisan bawang merah, mentimun, dan cabai rawit. Sate dimakan dengan nasi hangat atau, kalau di beberapa daerah disajikan dengan lontong atau ketupat.",
            imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/food_sate.jpg",
            origin = "Pulau Jawa, Indonesia",
            rating = 5.0,
            galleries = FoodGallery(
                items = listOf(
                    GalleryItem(
                        id = 1,
                        imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/gallery_sate_1.jpg"
                    ),
                    GalleryItem(
                        id = 2,
                        imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/gallery_sate_2.jpg"
                    ),
                    GalleryItem(
                        id = 3,
                        imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/gallery_sate_3.jpg"
                    ),
                    GalleryItem(
                        id = 4,
                        imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/gallery_sate_4.jpg"
                    )
                )
            )
        ),
        Food(
            id = 12,
            name = "Sop Buntut",
            description = "Sup buntut dibuat dengan ekor sapi. Sedikitnya ada lima versi sup buntut yang populer di seluruh dunia: makanan tradisional Korea, makanan Tiongkok yang lebih mirip semur, ekor sapi goreng/panggang dicampur dengan berbagai variasi sup merupakan makanan populer di Indonesia, makanan etnis Amerika Serikat bagian Selatan yang sudah ada sejak periode sebelum perang revolusi, dan sup kuah tebal dan gurih yang populer di Britania Raya sejak abad ke-18. Sup buntut Kreol dibuat dari tomat dengan ekor sapi, kentang, kacang hijau, jagung, mirepoix, bawang putih, dan rempah-rempah.\\n\\nSop buntut adalah salah satu masakan populer dalam masakan Indonesia. Terbuat dari potongan ekor sapi yang dibumbui kemudian dibakar atau digoreng dan dimasukkan ke dalam kuah kaldu sapi yang agak bening bersama irisan kentang, wortel, tomat, daun bawang, seledri dan taburan bawang goreng. Sop buntut Indonesia dibumbui dengan bawang merah, bawang putih, dan rempah-rempah lokal, seperti merica, pala, dan cengkih. Variasi yang relatif baru disebut \\\"Sop Buntut Goreng\\\" yaitu buntut goreng yang dibumbui disajikan kering, sementara kuah sup kaldunya disajikan dalam mangkuk terpisah.",
            imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/food_sopbuntut.jpg",
            origin = "Indonesia",
            rating = 5.0,
            galleries = FoodGallery(
                items = listOf(
                    GalleryItem(
                        id = 1,
                        imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/gallery_sopbuntut_1.jpg"
                    ),
                    GalleryItem(
                        id = 2,
                        imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/gallery_sopbuntut_2.jpg"
                    ),
                    GalleryItem(
                        id = 3,
                        imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/gallery_sopbuntut_3.jpg"
                    )
                )
            )
        ),
        Food(
            id = 13,
            name = "Soto",
            description = "Soto, sroto, sauto, tauto, atau coto adalah makanan khas Indonesia seperti sop yang terbuat dari kaldu daging dan sayuran. Daging yang paling sering digunakan adalah daging sapi dan ayam, tetapi ada pula yang menggunakan daging babi atau kambing. Berbagai daerah di Indonesia memiliki soto khas daerahnya masing-masing dengan komposisi yang berbeda-beda, misalnya soto Madura, soto Kediri, soto Pemalang, soto Lamongan, soto Jepara, soto Semarang, soto Kudus, soto Betawi, soto Padang, soto Bandung, sroto Sokaraja, soto Banjar, soto Medan, dan coto Makassar. Soto juga diberi nama sesuai isinya, misalnya soto ayam, soto babat, atau soto kambing. Ada pula soto yang dibuat dari daging kaki sapi yang disebut dengan soto sekengkel.\\n\\nCara penyajian soto berbeda-beda sesuai kekhasan di setiap daerah. Soto biasa dihidangkan dengan nasi, lontong, ketupat, mi, atau bihun. Untuk menambah kenikmatan soto, biasanya juga disertai berbagai macam lauk, misalnya kerupuk, perkedel, emping, sambal, dan sambal kacang. Ada pula yang menambahkan telur puyuh, sate kerang, jeruk limau, berbagai macam gorengan (tempe, tahu, bakwan) dan koya.",
            imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/food_soto.jpg",
            origin = "Indonesia",
            rating = 5.0,
            galleries = FoodGallery(
                items = listOf(
                    GalleryItem(
                        id = 1,
                        imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/gallery_soto_1.jpg"
                    ),
                    GalleryItem(
                        id = 2,
                        imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/gallery_soto_2.jpg"
                    ),
                    GalleryItem(
                        id = 3,
                        imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/gallery_soto_3.jpg"
                    ),
                    GalleryItem(
                        id = 4,
                        imageUrl = "https://raw.githubusercontent.com/mrandika/android-kelaperan_compose/main/image/gallery_soto_4.jpg"
                    )
                )
            )
        ),
    )
}
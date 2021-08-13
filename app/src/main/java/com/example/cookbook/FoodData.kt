package com.example.cookbook

object FoodData {
    private var name = arrayOf(
        "Salad Buah",
        "Telur Dadar",
        "Pangsit Goreng",
        "Sandwich",
        "Smoothies Mangga",
        "Ayam Asam Manis",
        "Kebab",
        "Lumpia Ayam",
        "Sup Telur",
        "Perkedel Kentang Keju"
    )

    private var brief = arrayOf(
        "Perpaduan buah yang simple dan menyehatkan",
        "Olahan telur yang enak dan tidak membosankan",
        "Daging cincang yang dibungkus kulit pangsit dan digoreng",
        "Roti dengan beragam isian dengan gizi yang seimbang",
        "Minuman rasa mangga yang menyegarkan dan sehat",
        "Ayam goreng yang dibalut saus asam manis",
        "Irisah daging dan sayur yang dibungkus menggunakan tortila",
        "Daging ayam dibungkus lapisan yang renyah",
        "Sup sederhana untuk menghangatkan tubuh",
        "Paduan kentang dan keju dalam perkedel"
    )

    private var material = arrayOf(
        "1. Melon\n" +
                "2. Kiwi\n" +
                "3. Strawberi\n" +
                "4. Anggur\n" +
                "5. Mayonaise\n" +
                "6. Susu kental manis\n" +
                "7. Keju balok",
        "1. Telur\n" +
                "2. Daging cincang\n" +
                "3. Daun bawang\n" +
                "4. Wortel cincang\n" +
                "5. Bawang putih\n" +
                "6. Garam dan lada\n" +
                "7. Sayur",
        "1. Daging ayam cincang\n" +
                "2. Kaldu ayam\n" +
                "3. Kaldu jamur\n" +
                "4. Telur\n" +
                "5. Kulit pangsit",
        "1. Ham sapi\n" +
                "2. Selada\n" +
                "3. Tomat\n" +
                "4. Timun\n" +
                "5. Keju lembar\n" +
                "6. Saos tomat dan cabe\n" +
                "7. Mayonaise\n" +
                "8. Roti tawar",
        "1. Buah Mangga\n" +
                "2. Cream Cheese\n" +
                "3. Es krim vanila\n" +
                "4. Yoghurt tawar",
        "1. Ayam potong tanpa tulang\n" +
                "2.Tepung bumbu\n" +
                "3. Tepung maizena\n" +
                "3. Saos tomat, cabe, dan tiram\n" +
                "4. Bawang bombay\n" +
                "5. Bawang putih\n" +
                "6. Air\n" +
                "7. Nanas\n" +
                "8. Timun\n" +
                "9. Wortel\n" +
                "10. Kaldu jamur" +
                "11. Garam dan lada",
        "1. Sosis ayam\n" +
                "2. Selada\n" +
                "3. Timun\n" +
                "4. Tomat\n" +
                "5. Saos tomat dan cabe\n" +
                "6. Mayonaise\n" +
                "7. Tortila",
        "1. Ayam cincang\n" +
                "2. Wortel\n" +
                "3. Tauge\n" +
                "4. Kulit lumpia\n" +
                "5. Garam, gula, dan lada",
        "1. Telur\n" +
                "2. Bawang bombay\n" +
                "3. Kecap asin\n" +
                "4. Lada\n" +
                "5. Air\n" +
                "6. Rumpur laut\n" +
                "7. Daun bawang",
        "1. Kentang\n" +
                "2. Keju\n" +
                "3. Kaldu ayam bubuk\n" +
                "4. Merica, lada, dan garam\n" +
                "5. Tepung maizena\n"
    )

    private var step = arrayOf(
        "1. Potong buah menjadi kecil kecil\n" +
                "2. Masukkan buah ke dalam mangkok\n" +
                "3. Campurkan susu kental manis dan mayonaise ke dalam mangkok lainnya\n" +
                "4. Aduk rata campuran susu kental manis dan mayonaise\n" +
                "5. Tuang campuran susu kental manis dan mayonaise ke mangkok buah\n" +
                "6. Tambahkan parutan keju di atasnya",
        "1. Tumis bawang dan daging cincang\n" +
                "2. Kocok telur lalu campur dengan sayur, daging, bawang, garam, dan lada\n" +
                "3. Goreng hingga matang",
        "1. Campur daging ayam, telor, dan bumbu hingga merata\n" +
                "2. Goreng campuran daging ayam hingga matang\n" +
                "3. Masukkan daging ayam ke dalam kulit pangsit\n" +
                "4. Lipat kulit pangsit hingga tertutup rapi\n" +
                "5. Ulangi langkah 3 dan 4\n" +
                "6. Goreng pangsit hingga matang",
        "1. Goreng ham hingga matang\n" +
                "2. Panggang roti agar gurih\n" +
                "3. Taruh daging ham, keju, irisan tomat, irisan timun, saos, dan mayonaise diantara 2 roti tawar\n",
        "1. Potong-potong buah mangga\n" +
                "2. Masukkan buah mangga yang telah dipotong, cream cheese, es krim, dan yoghurt ke dalam blender\n" +
                "3. Blender hingga tercampur rata\n" +
                "4. Tuang smoothies ke dalam gelas",
        "1. Potong ayam menjadi kecil-kecil\n" +
                "2. Lapisi ayam dengan tepung bumbu\n" +
                "3. Goreng ayam hingga matang\n" +
                "4. Tumis bawang bombay dan bawang putih\n" +
                "5. Tambahkan air untuk saosnya\n" +
                "6. Tambahkan saos tomat, cabe, dan tiram\n" +
                "7. Tambahkan irisan nanas\n" +
                "8. Tambahkan tepung maizena yang sudah dicampurkan dengan air agar mengental\n" +
                "9. Jika sudah mulai mengental tambahkan garam, lada, dan kaldu jamur\n" +
                "10. Jika sudah matang tambahkan irisan timun dan wortel\n" +
                "11. Tuang saos yang sudah matang ke ayam",
        "1. Goreng sosis hingga matang\n" +
                "2. Siapkan tortila\n" +
                "3. Tata sosis, selada, irisan tomat dan timun di atas tortila\n" +
                "4. Jika ukuran sosis terlalu besar, dapat dipotong hingga cukup\n" +
                "5. Tambahkan saos dan mayonaise\n" +
                "6. Lipat tortila hingga hanya ada 1 bagian yang terbuka\n" +
                "7. Goreng kebab higga kecoklatan",
        "1. Bumbui ayam dengan garam, gula, dan lada lalu digoreng hingga matang\n" +
                "2. Potong wortel menjadi kecil-keccil\n" +
                "3. Tata isian (ayam, wortel, dan tauge) di tengah kulit lumpia\n" +
                "4. Lipat kulit lumpia hingga membungkus isiannya, pada bagian ujung kulit dapat ditambahkan air agar lebih merekat\n" +
                "5. Goreng lumpia yang sudah dilipat hingga matang",
        "1. Kocok telur hingga putih dan kuningnya menyatu dan tidak mengembang\n" +
                "2. Potong dadu bawang bombay\n" +
                "3. Rebus air bersama bawang bombay, kecap asin, dan lada\n" +
                "4. Setelah mendidih, tuangkan kocokan telur sambil diaduk hingga telur yang direbus membentuk serabut\n" +
                "5. Matikkan api kompor\n" +
                "6. Masukkan rumput laut dan potongan daun bawang",
        "1. Rebus kentang hingga matang\n" +
                "2. Haluskan kentang\n" +
                "3. Tambahkan parutan keju, tepung maizena, kaldu ayam bubuk, garam, lada, dan merica\n" +
                "4. Aduk hingga tercampur secara merata dan menyatu\n" +
                "5. Bentuk bola-bola dan goreng satu persatu"
    )

    private var photo = arrayOf(
        R.drawable.salad_buah,
        R.drawable.telur_dadar,
        R.drawable.pangsit_goreng,
        R.drawable.sandwich,
        R.drawable.smoothies_mangga,
        R.drawable.ayam_asam_manis,
        R.drawable.kebab,
        R.drawable.lumpia_ayam,
        R.drawable.sup_telur,
        R.drawable.perkedel_kentang_keju
    )

    val listData: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for (position in name.indices) {
                val food = Food()
                food.name = name[position]
                food.brief = brief[position]
                food.material = material[position]
                food.step = step[position]
                food.photo = photo[position]
                list.add(food)
            }
            return list
        }
}
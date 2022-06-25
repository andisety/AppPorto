package com.andi.myportofolio

object PortoData {

    val nameCertified = arrayOf(
        "Kursus HTML & CSS",
        "Kursus PHP",
        "Kursus JavaScript",
        "Kursus SQL",
        "Belajar Dasar Pemrogaman Web",
        "Belajar Membuat Front-End Web untuk Pemula",
        "Memulai Pemrogaman Dengan Kotlin",
        "Belajar Membuat Aplikasi Android Untuk Pemula"
    )
    val platformCertified= arrayOf(
        "Progate",
        "Progate",
        "Progate",
        "Progate",
        "Dicoing",
        "Dicoing",
        "Dicoing",
        "Dicoing",
    )
    val photoCertified = intArrayOf(
        R.drawable.progate_html_css,
        R.drawable.progate_php,
        R.drawable.progate_javascript,
        R.drawable.progate_sql,
        R.drawable.dicoding_dasar_web,
        R.drawable.dicoding_pemula_web,
        R.drawable.kotlin,
        R.drawable.dicoding_android_pemula
    )

    val listData:ArrayList<Porto>
    get() {
        val list = arrayListOf<Porto>()

        for (position in nameCertified.indices){
            val porto = Porto()
            porto.title= nameCertified[position]
            porto.platform= platformCertified[position]
            porto.photo= photoCertified[position]
            list.add(porto)
        }
        return list
    }
}
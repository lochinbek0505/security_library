package com.example.library

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.library.adapter.Recycler2Adapter
import com.example.library.adapter.RecyclerAdapter
import com.example.library.databinding.ActivityRecyclerBinding
import com.example.library.models.doc_model
import com.example.library.models.main_model
import com.example.library.models.question_model
import com.example.library.models.test_model

class RecyclerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRecyclerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRecyclerBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val ch = intent.getSerializableExtra("main") as main_model
        binding.tvTittle.text = ch.name



        when (ch.count) {

            1 -> {

                var ii = 1;
                var list = arrayListOf<doc_model>()



                list.add(
                    doc_model(
                        "https://firebasestorage.googleapis.com/v0/b/library-3c66e.appspot.com/o/nazariy%2Fa.pdf?alt=media&token=1c495c86-29ac-4d99-8ab5-14dce6711633",
                        "1 - mavzu nazariy"
                    )
                )

                list.add(
                    doc_model(
                        " https://firebasestorage.googleapis.com/v0/b/library-3c66e.appspot.com/o/nazariy%2Fb.pdf?alt=media&token=137ecd00-3f74-473f-abbd-db38a0c42049",
                        "2 - mavzu nazariy"
                    )
                )

                list.add(
                    doc_model(
                        "https://firebasestorage.googleapis.com/v0/b/library-3c66e.appspot.com/o/nazariy%2Fc.pdf?alt=media&token=ee05f305-597d-4730-bf3f-9d69adb098b2",
                        "3 - mavzu nazariy"
                    )
                )

                list.add(
                    doc_model(
                        "https://firebasestorage.googleapis.com/v0/b/library-3c66e.appspot.com/o/nazariy%2Fd.pdf?alt=media&token=52d53c06-f854-4e72-b08a-288056ea090f",
                        "4 - mavzu nazariy"
                    )
                )

                list.add(
                    doc_model(
                        "https://firebasestorage.googleapis.com/v0/b/library-3c66e.appspot.com/o/nazariy%2Fe.pdf?alt=media&token=160aee6f-15f7-4c80-ba0d-c072d9d8d39f",
                        "5 - mavzu nazariy"
                    )
                )

                list.add(
                    doc_model(
                        "https://firebasestorage.googleapis.com/v0/b/library-3c66e.appspot.com/o/nazariy%2Ff.pdf?alt=media&token=652dda35-6299-41cb-89d7-5c16d4bd01b6",
                        "6 - mavzu nazariy"
                    )
                )
                list.add(
                    doc_model(
                        "https://firebasestorage.googleapis.com/v0/b/library-3c66e.appspot.com/o/nazariy%2Fg.pdf?alt=media&token=aedfd81e-dff3-446e-81dd-1f4010d85ab4",
                        "7 - mavzu nazariy"
                    )
                )

                list.add(
                    doc_model(
                        "https://firebasestorage.googleapis.com/v0/b/library-3c66e.appspot.com/o/nazariy%2Fh.pdf?alt=media&token=4155c8c4-408e-4a83-a6b7-bff09a23548f",
                        "8 - mavzu nazariy"
                    )
                )
                list.add(
                    doc_model(
                        "https://firebasestorage.googleapis.com/v0/b/library-3c66e.appspot.com/o/nazariy%2Fi.pdf?alt=media&token=9868d894-142f-4128-ae4b-d7356af97456",
                        "9 - mavzu nazariy"
                    )
                )
                list.add(
                    doc_model(
                        "https://firebasestorage.googleapis.com/v0/b/library-3c66e.appspot.com/o/nazariy%2Fj.pdf?alt=media&token=55a4c0aa-30d7-4ad4-89c5-e8bcfc3528eb",
                        "10 - mavzu nazariy"
                    )
                )
                adapter(list)

            }

            2 -> {
                var list = arrayListOf<doc_model>()

                list.add(
                    doc_model(
                        "https://firebasestorage.googleapis.com/v0/b/library-3c66e.appspot.com/o/amaliy%2F1%20-%20amali%20mashg'ulot.pdf?alt=media&token=85b0c3f5-d917-4668-bc2a-53c4565e8e86",
                        "1 - amaliy mashg'ulot"
                    )
                )
                list.add(
                    doc_model(
                        "https://firebasestorage.googleapis.com/v0/b/library-3c66e.appspot.com/o/amaliy%2F2%20-%20amali%20mashg'ulot.pdf?alt=media&token=0c11af1e-53dd-4972-84d7-19ba7acdb97f",
                        "2 - amaliy mashg'ulot"
                    )
                )
                list.add(
                    doc_model(
                        "https://firebasestorage.googleapis.com/v0/b/library-3c66e.appspot.com/o/amaliy%2F3%20-%20amali%20mashg'ulot.pdf?alt=media&token=cf61fb21-8378-4492-a85c-2b61c90498d4",
                        "3 - amaliy mashg'ulot"
                    )
                )
                list.add(
                    doc_model(
                        "https://firebasestorage.googleapis.com/v0/b/library-3c66e.appspot.com/o/amaliy%2F4%20-%20amali%20mashg'ulot.pdf?alt=media&token=c1a92069-b5e5-4e93-8435-419ef2c6c73d",
                        "4 - amaliy mashg'ulot"
                    )
                )
                list.add(
                    doc_model(
                        "https://firebasestorage.googleapis.com/v0/b/library-3c66e.appspot.com/o/amaliy%2F5%20-%20amali%20mashg'ulot.pdf?alt=media&token=8229834d-8130-40b1-86bf-9045b0a260b5",
                        "5 - amaliy mashg'ulot"
                    )
                )
                list.add(
                    doc_model(
                        "https://firebasestorage.googleapis.com/v0/b/library-3c66e.appspot.com/o/amaliy%2F6%20-%20amali%20mashg'ulot.pdf?alt=media&token=62f687b3-d9c2-4a31-a14b-70e3680382fb",
                        "6 - amaliy mashg'ulot"
                    )
                )
                list.add(
                    doc_model(
                        "https://firebasestorage.googleapis.com/v0/b/library-3c66e.appspot.com/o/amaliy%2F7%20-%20amali%20mashg'ulot.pdf?alt=media&token=50a9f167-e3aa-4315-96b8-b26bd88a5188",
                        "7 - amaliy mashg'ulot"
                    )
                )
                list.add(
                    doc_model(
                        "https://firebasestorage.googleapis.com/v0/b/library-3c66e.appspot.com/o/amaliy%2F8%20-%20amali%20mashg'ulot.pdf?alt=media&token=1fb85139-a708-4852-bcfc-2a75c12a8f3d",
                        "8 - amaliy mashg'ulot"
                    )
                )

                list.add(
                    doc_model(
                        "https://firebasestorage.googleapis.com/v0/b/library-3c66e.appspot.com/o/amaliy%2F9%20-%20amali%20mashg'ulot.pdf?alt=media&token=0b4bc249-a81c-4c0e-9bac-c5276cdb8712",
                        "9 - amaliy mashg'ulot"
                    )
                )
                list.add(
                    doc_model(
                        "https://firebasestorage.googleapis.com/v0/b/library-3c66e.appspot.com/o/amaliy%2F10%20-%20amali%20mashg'ulot.pdf?alt=media&token=3c22e399-50fa-4bb1-9156-db4b83b7b10d",
                        "10 - amaliy mashg'ulot"
                    )
                )

                adapter(list)

            }

            3 -> {
                var list = arrayListOf<doc_model>()
                list.add(
                    doc_model(
                        "https://firebasestorage.googleapis.com/v0/b/library-3c66e.appspot.com/o/slayd%2F1%20-%20%D0%BC%D0%B0%D1%8A%D1%80%D1%83%D0%B7%D0%B0.pdf?alt=media&token=af643fd8-b691-443a-b9a3-168b884711d9",
                        "1 - taqdimot"
                    )
                )
                list.add(
                    doc_model(
                        "https://firebasestorage.googleapis.com/v0/b/library-3c66e.appspot.com/o/slayd%2F2-%D0%BC%D0%B0%D1%8A%D1%80%D1%83%D0%B7%D0%B0.pdf?alt=media&token=34340dae-1fad-49d3-9080-e9ba93f4f1de",
                        "2 - taqdimot"
                    )
                )
                list.add(
                    doc_model(
                        "https://firebasestorage.googleapis.com/v0/b/library-3c66e.appspot.com/o/slayd%2F3-%20%20%D0%BC%D0%B0%D1%8A%D1%80%D1%83%D0%B7%D0%B0.pdf?alt=media&token=f7ff96f8-62c7-4b32-ad4a-3a1c8ca8742b",
                        "3 - taqdimot"
                    )
                )
                list.add(
                    doc_model(
                        "https://firebasestorage.googleapis.com/v0/b/library-3c66e.appspot.com/o/slayd%2F4-ma%60ruza.pdf?alt=media&token=4bddf375-14c8-4373-92c3-77f57bd374a7",
                        "4 - taqdimot"
                    )
                )
                list.add(
                    doc_model(
                        "https://firebasestorage.googleapis.com/v0/b/library-3c66e.appspot.com/o/slayd%2F5%20-%20%D0%BC%D0%B0%D1%8A%D1%80%D1%83%D0%B7%D0%B0.pdf?alt=media&token=b490fcf3-5411-4327-9e46-9e4e8156e664",
                        "5 - taqdimot"
                    )
                )
                list.add(
                    doc_model(
                        "https://firebasestorage.googleapis.com/v0/b/library-3c66e.appspot.com/o/slayd%2F6%20-%20%D0%BC%D0%B0%D1%8A%D1%80%D1%83%D0%B7%D0%B0.pdf?alt=media&token=2e620b1c-49d7-43ba-ad7b-bc99d98017c7",
                        "6 - taqdimot"
                    )
                )
                list.add(
                    doc_model(
                        "https://firebasestorage.googleapis.com/v0/b/library-3c66e.appspot.com/o/slayd%2F7%20-%20%D0%BC%D0%B0%D1%8A%D1%80%D1%83%D0%B7%D0%B0.pdf?alt=media&token=09cf8e4d-6df1-429c-b83a-58140a2ad94b",
                        "7 - taqdimot"
                    )
                )
                list.add(
                    doc_model(
                        "https://firebasestorage.googleapis.com/v0/b/library-3c66e.appspot.com/o/slayd%2F8%20-%20%D0%BC%D0%B0%D1%8A%D1%80%D1%83%D0%B7%D0%B0.pdf?alt=media&token=4cab0ce2-2831-4554-90fe-0c2901661f7b",
                        "8 - taqdimot"
                    )
                )
                list.add(
                    doc_model(
                        "https://firebasestorage.googleapis.com/v0/b/library-3c66e.appspot.com/o/slayd%2F9%20-%20%D0%BC%D0%B0%D1%8A%D1%80%D1%83%D0%B7%D0%B0.pdf?alt=media&token=d41c92e6-e678-477c-9af5-ba382c83b6b8",
                        "9 - taqdimot"
                    )
                )
                list.add(
                    doc_model(
                        "https://firebasestorage.googleapis.com/v0/b/library-3c66e.appspot.com/o/slayd%2F10%20-%20%D0%BC%D0%B0%D1%8A%D1%80%D1%83%D0%B7%D0%B0.pdf?alt=media&token=aefb4d41-61a1-438c-9467-6634eeb411d6",
                        "10 - taqdimot"
                    )
                )
                adapter(list)


            }

            4 -> {
                var list = arrayListOf<doc_model>()
                list.add(
                    doc_model(
                        "https://firebasestorage.googleapis.com/v0/b/library-3c66e.appspot.com/o/Sillabus%20kiberxavfsizlik%20asoslari.pdf?alt=media&token=1dd91893-ec0e-4a12-bafc-5ff1337f7424",
                         "1 - me'yoriy hujjat"
                    )
                )
                list.add(
                    doc_model(
                        "https://firebasestorage.googleapis.com/v0/b/library-3c66e.appspot.com/o/Sillabus%20kiberxavfsizlik%20asoslari.pdf?alt=media&token=1dd91893-ec0e-4a12-bafc-5ff1337f7424",
                        "2 - me'yoriy hujjat"
                    )
                )
                adapter(list)


            }
//            https://youtu.be/unTavenYgDo?si=MKm1e-N4JLG61djs
//            https://youtu.be/tAzT4h0Pwt0?si=e-2uhRV6kD_bBYfz
//            https://youtu.be/JA5vwMW18io?si=XVEpj7NeKNRfW6X5
//            https://youtu.be/9Il1tlODnVA?si=ki-0-Zbb4ZN0lIej

            5 -> {
                var list = arrayListOf<doc_model>()
                list.add(doc_model("unTavenYgDo", "1 - video "))
                list.add(doc_model("tAzT4h0Pwt0", "2 - video "))
                list.add(doc_model("JA5vwMW18io", "3 - video "))
                list.add(doc_model("9Il1tlODnVA", "4 - video "))
//                list.add(doc_model("S0Q4gqBUs7c", "5 - video "))
                adapter2(list)

            }

            6 -> {

                var list = arrayListOf<test_model>()
                val tests1 = arrayListOf(
                    question_model(
                        question = "Deshifrlash uchun kalit va ..... kerak bo‘ladi.",
                        correct = "d",
                        a = "alifbo",
                        b = "kodlash",
                        c = "ochiq matn",
                        d = "shifrmatn"
                    ),
                    question_model(
                        question = "Ma’lumot shifrlansa, natijasi .... bo‘ladi.",
                        correct = "d",
                        a = "nomalum",
                        b = "ochiq matn",
                        c = "kod",
                        d = "shifrmatn"
                    ),
                    question_model(
                        question = "..... axborotni ifodalash uchun foydalaniladigan chekli sondagi belgilar to‘plami.",
                        correct = "d",
                        a = "Kodlash",
                        b = "Shifrmatn",
                        c = "Ochiq matn",
                        d = "Alifbo"
                    ),
                    question_model(
                        question = "Kriptotahlil so‘ziga berilgan to‘g‘ri tavsifni toping?",
                        correct = "d",
                        a = "Axborotni himoyalash fani va sanati.",
                        b = "Maxfiy shifrlarni yaratish va buzish fani va sanati.",
                        c = "Maxfiy shifrlarni yaratish fani va sanati.",
                        d = "Maxfiy shifrlarni buzish fani va sanati."
                    ),
                    question_model(
                        question = "Kriptografiya so‘ziga berilgan to‘g‘ri tavsifni toping?",
                        correct = "d",
                        a = "Maxfiy shifrlarni yaratish va buzish fani va sanati.",
                        b = "Axborotni himoyalash fani va sanati.",
                        c = "Maxfiy shifrlarni buzish fani va sanati.",
                        d = "Maxfiy shifrlarni yaratish fani va sanati."
                    )
                )

                list.add(test_model("1 - test ", tests1))
                val questions = arrayListOf(
                    question_model(
                        question = ".... kriptotizimni shifrlash va deshifrlash uchun sozlashda foydalaniladi.",
                        correct = "d",
                        a = "Alifbo",
                        b = "Ochiq matn",
                        c = "Algoritm",
                        d = "Kriptografik kalit"
                    ),
                    question_model(
                        question = "Kriptologiya so‘ziga berilgan to‘g‘ri tavsifni toping?",
                        correct = "d",
                        a = "Maxfiy shifrlarni yaratish fani va sanati.",
                        b = "Axborotni himoyalash fani va sanati.",
                        c = "Maxfiy shifrlarni buzish fani va sanati.",
                        d = "Maxfiy shifrlarni yaratish va buzish fani va sanati."
                    ),
                    question_model(
                        question = "Jumlani to‘ldiring. ... sohasi tashkil etuvchilar xavfsizligi, aloqa xavfsizligi va dasturiy ta’minotlar xavfsizligidan iborat.",
                        correct = "d",
                        a = "Inson xavfsizligi",
                        b = "Tashkilot xavfsizligi",
                        c = "Ma’lumotlar xavfsizligi",
                        d = "Tizim xavfsizligi"
                    ),
                    question_model(
                        question = "Har qanday vaziyatda biror bir hodisani yuzaga kelish ehtimoli qo‘shilsa ....",
                        correct = "d",
                        a = "hujum paydo bo‘ladi.",
                        b = "tahdid paydo bo‘ladi.",
                        c = "aktiv paydo bo‘ladi.",
                        d = "risk paydo bo‘ladi."
                    ),
                    question_model(
                        question = "Axborot xavfsizligida boshqarish vositasi bu?",
                        correct = "a",
                        a = "Bir yoki bir nechta tahdidga sabab bo‘luvchi tashkilot aktivi yoki boshqaruv tizimidagi kamchilik.",
                        b = "Tizim yoki tashkilotga zarar yetkazishi mumkin bo‘lgan istalmagan hodisa.",
                        c = "Tashkilot uchun qadrli bo‘lgan ixtiyoriy narsa.",
                        d = "Natijasi zaiflik yoki tahdidga ta’sir qiluvchi riskni o‘zgartiradigan harakatlar."
                    )
                )
                list.add(test_model("2 - test ", questions))
                val questions2 = arrayListOf(
                    question_model(
                        question = "Axborot xavfsizligida zaiflik bu?",
                        correct = "a",
                        a = "Tahdidga sabab bo‘luvchi tashkilot aktivi yoki boshqaruv tizimidagi nuqson.",
                        b = "Noaniqlikning maqsadlarga ta’siri.",
                        c = "Tizim yoki tashkilotga zarar yetkazishi mumkin bo‘lgan istalmagan hodisa.",
                        d = "Tashkilot uchun qadrli bo‘lgan ixtiyoriy narsa."
                    ),
                    question_model(
                        question = "Jumlani to‘ldiring. Denial of service (DOS) hujumi axborotni .... xususiyatini buzushga qaratilgan.",
                        correct = "a",
                        a = "foydalanuvchanlik",
                        b = "Konfidensiallik",
                        c = "butunlik",
                        d = "ishonchlilik"
                    ),
                    question_model(
                        question = "Axborot xavfsizligida aktiv bu?",
                        correct = "a",
                        a = "Tashkilot yoki foydalanuvchi uchun qadrli bo‘lgan ixtiyoriy narsa.",
                        b = "Tizim yoki tashkilotga zarar yetkazishi mumkin bo‘lgan istalmagan hodisa.",
                        c = "U yoki bu faoliyat jarayonida nimaga erishishni xohlashimiz.",
                        d = "Noaniqlikning maqsadlarga ta’siri."
                    ),
                    question_model(
                        question = "Axborot xavfsizligida tahdid bu?",
                        correct = "a",
                        a = "Aktivga zarar yetkazishi mumkin bo‘lgan istalmagan hodisa.",
                        b = "Tashkilot uchun qadrli bo‘lgan ixtiyoriy narsa.",
                        c = "U yoki bu faoliyat jarayonida nimaga erishishni xohlashimiz.",
                        d = "Noaniqlikning maqsadlarga ta’siri."
                    ),
                    question_model(
                        question = "Axborot xavfsizligida risk bu?",
                        correct = "a",
                        a = "Manbaga zarar keltiradigan ichki yoki tashqi zaiflik ta’sirida tahdid qilish ehtimoli.",
                        b = "Tashkilot uchun qadrli bo‘lgan ixtiyoriy narsa.",
                        c = "U yoki bu faoliyat jarayonida nimaga erishishni xoxlashimiz.",
                        d = "Tizim yoki tashkilotga zarar yetkazishi mumkin bo‘lgan istalmagan hodisa."
                    )
                )
                list.add(test_model("3 - test ", questions2))
                val questions3 = arrayListOf(
                    question_model(
                        question = "Jumlani to‘ldiring. Tizimli fikrlash ... uchun kerak.",
                        correct = "a",
                        a = "ma’lumot, axborot va tizimdan foydalanish",
                        b = "bo‘lishi mumkin bo‘lgan xavfni oldini olish",
                        c = "ma’lumotni aniq va ishonchli ekanligini bilish",
                        d = "kafolatlangan amallarni ta’minlash"
                    ),
                    question_model(
                        question = "Jumlani to‘ldiring. Hujumchi kabi fikrlash ... kerak.",
                        correct = "a",
                        a = "ma’lumot, axborot va tizimdan foydalanish uchun",
                        b = "kafolatlangan amallarni ta’minlash uchun",
                        c = "ma’lumotni aniq va ishonchli ekanligini bilish uchun",
                        d = "bo‘lishi mumkin bo‘lgan xavfni oldini olish uchun"
                    ),
                    question_model(
                        question = "Yaxlitlikni ta’minlash bu - ?",
                        correct = "a",
                        a = "ruxsatsiz bajarishdan himoyalash.",
                        b = "ruxsatsiz o‘qishdan himoyalash.",
                        c = "ruxsat etilgan amallarni bajarish.",
                        d = "ruxsatsiz yozishdan himoyalash."
                    ),
                    question_model(
                        question = "Foydalanuvchanlikni ta’minlash bu - ?",
                        correct = "a",
                        a = "ruxsatsiz o‘qishdan himoyalash.",
                        b = "ruxsatsiz yozishdan himoyalash.",
                        c = "ruxsat etilgan amallarni bajarish.",
                        d = "ruxsatsiz bajarishdan himoyalash."
                    ),
                    question_model(
                        question = "Konfidensiallikni ta’minlash bu - ?",
                        correct = "a",
                        a = "ruxsatsiz bajarishdan himoyalash.",
                        b = "ruxsatsiz yozishdan himoyalash.",
                        c = "ruxsat etilgan amallarni bajarish.",
                        d = "ruxsatsiz o‘qishdan himoyalash."
                    )
                )
                list.add(test_model("4 - test ", questions3))
                val questions4 = arrayListOf(
                    question_model(
                        question = ".... kriptografik shifrlash algoritmlari blokli va oqimli turlarga ajratiladi.",
                        correct = "a",
                        a = "Simmetrik",
                        b = "Asimmetrik",
                        c = "Ochiq kalitli",
                        d = "Klassik davr"
                    ),
                    question_model(
                        question = "Ikki kalitli kriptotizim bu -",
                        correct = "a",
                        a = "ochiq kalitli kriptotizim.",
                        b = "xesh funksiyalar.",
                        c = "simmetrik kriptotizim.",
                        d = "MAC tizimlari."
                    ),
                    question_model(
                        question = "Jumlani to‘ldiring. ... kompyuter davriga tegishli shifrlarga misol bo‘la oladi.",
                        correct = "a",
                        a = "DES, AES shifri",
                        b = "Kodlar kitobi",
                        c = "Sezar shifri",
                        d = "Enigma shifri"
                    ),
                    question_model(
                        question = "Xesh funksiyalar - .... funksiya.",
                        correct = "a",
                        a = "kalitsiz kriptografik",
                        b = "ikki kalitli kriptografik",
                        c = "bir kalitli kriptografik",
                        d = "ko‘p kalitli kriptografik"
                    ),
                    question_model(
                        question = "Ma’lumotni mavjudligini yashirishda .....",
                        correct = "a",
                        a = "steganografik algoritmdan foydalaniladi.",
                        b = "kodlash algoritmidan foydalaniladi.",
                        c = "kriptografik algoritmdan foydalaniladi.",
                        d = "kriptotahlil algoritmidan foydalaniladi."
                    )
                )
                list.add(test_model("5 - test ", questions4))

                adapter3(list)


            }

        }

    }


    fun adapter(list: ArrayList<doc_model>) {


        val adapter = RecyclerAdapter(list, object : RecyclerAdapter.ItemSetOnClickListener {
            override fun onClick(data: doc_model) {

                val intent = Intent(this@RecyclerActivity, ShowActivity::class.java)
                intent.putExtra("res_m", data)
                startActivity(intent)
            }


        })
        binding.rvRecyc.adapter = adapter

    }

    fun adapter2(list: ArrayList<doc_model>) {


        val adapter = RecyclerAdapter(list, object : RecyclerAdapter.ItemSetOnClickListener {
            override fun onClick(data: doc_model) {

                val intent = Intent(this@RecyclerActivity, VideoActivity::class.java)
                intent.putExtra("res_v", data)
                startActivity(intent)
            }


        })
        binding.rvRecyc.adapter = adapter

    }

    fun adapter3(list: ArrayList<test_model>) {


        val adapter = Recycler2Adapter(list, object : Recycler2Adapter.ItemSetOnClickListener {
            override fun onClick(data: test_model) {

                val intent = Intent(this@RecyclerActivity, TestActivity::class.java)
                intent.putExtra("res_t", data)
                startActivity(intent)
            }


        })
        binding.rvRecyc.adapter = adapter

    }
}
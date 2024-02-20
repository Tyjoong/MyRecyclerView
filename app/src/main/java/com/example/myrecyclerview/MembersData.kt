package com.example.recycleview

import com.example.myrecyclerview.Member

object MembersData {
    private val data = arrayOf(
        arrayOf(
            "Kim Hong Joong (김홍중)",
            "He was born in Anyang, Gyeonggi-do, South Korea. The CEO gave him the name of ‘Captain’ because of their worldview/concept.If the ATEEZ’s members call Hongjoong « Leader » instead of « Captain », they have to give him 50,000 wons.",
            "https://kprofiles.com/wp-content/uploads/2018/05/HONGJOONG-640x800.jpg"
        ),
        arrayOf(
            "Park Seong Hwa (박성화)",
            "He was born in Jinju, Gyeongnam, South Korea. Nicknames: Mars (Hwaseong), Angrybird. His hobbies are watching dramas, building action figures, cleaning, ASMR and playing games.",
            "https://kprofiles.com/wp-content/uploads/2018/05/SEONGHWA-640x800.jpg"
        ),
        arrayOf(
            "Jeong Yun Ho (정윤호)",
            "He was born in Gwangju, South Korea. Nicknames: Yunhogizer, Golden Retriever, Big bear. Yunho and Mingi have known each other before joining KQ Entertainment. They both auditioned for the company without the other knowing and met at the audition.",
            "https://kprofiles.com/wp-content/uploads/2018/05/YUNHO-640x800.jpg"
        ),
        arrayOf(
            "Kang Yeo Sang (강여상)",
            "He was born in Pohang, South Korea. The fans call him Maltese but he insists on being called a Doberman. Yeosang has a distinctive birthmark near his left eye but it often gets covered with makeup.",
            "https://kprofiles.com/wp-content/uploads/2018/05/YEOSANG-640x800.jpg"
        ),
        arrayOf(
            "Choi San (최산)",
            "He was born in Namhae, South Gyeongsan, South Korea. San is the first idol from Namhae and he takes great pride in it. In 2021, he even became a promotional ambassador for his hometown. Nicknames: Sannie, Mountain, Santan, Chestnut.",
            "https://kprofiles.com/wp-content/uploads/2018/05/SAN-640x800.jpg"
        ),
        arrayOf(
            "Song Min Gi (송민기)",
            "He was born in Incheon, South Korea. Nicknames: Mingki, Man Gi, Princess Minki. Mingi acts like the youngest when they are in their dorms or in the studio. (Forbes Interview)",
            "https://kprofiles.com/wp-content/uploads/2018/05/MINGI-640x800.jpg"
        ),
        arrayOf(
            "Jung Woo Young (정우영)",
            "He was born in Ilsan, Gyeonggi-do, South Korea. Wooyoung is a former Big Hit trainee. After leaving Big Hit, Wooyoung had a choice about companies but chose to join KQ Entertainment because of Yeosang. He said that they will ever succeed together or fail together.",
            "https://kprofiles.com/wp-content/uploads/2018/05/B59FBE27-051F-448F-9365-1CD740BE7F0E-640x800.jpeg"
        ),
        arrayOf(
            "Choi Jong Ho (최종호)",
            "He was born in Ilsan, but he moved to Seoul at a very young age. Nicknames: Apple, Power-Jongho, Little bear, Jjong. His specialty is arm wrestling, singing, playing soccer, splitting apple and acting. Jongho’s lifetime motto is “Do not be afraid if you have not even tried.”",
            "https://kprofiles.com/wp-content/uploads/2018/05/52F0E0CF-A2F4-4D94-9E9A-181D1F6EE63B-640x800.jpeg"
        ),
        arrayOf(
            "Choi Hyun-Woo (최현우)",
            "He is from Gangneung, South Korea. He was in a school band and was the main vocal, and loved showing his vocal skills. Hyunwoo can speak English and Japanese.",
            "https://kprofiles.com/wp-content/uploads/2023/02/43BF3995-7A3F-4137-9822-3E95395E72B1-900x709.jpeg"
        ),
        arrayOf(
            "Park Se-Eun (박세은)",
            "He was born in Dalseo, Daegu, South Korea. Seeun and Hunter are both ex-Pledis trainees and they met right after Hunter moved to Korea. His favorite music genres are hip-hop and pop.",
            "https://kprofiles.com/wp-content/uploads/2023/02/57EF7CCD-29B5-485C-A3A1-356EB6F3AE37-641x800.jpeg"
        ),
        arrayOf(
            "Papung-korn Lertkiatdamrong (ปภังกร เลิศเกียรติดำรงค์) / Hunter (헌터) (ฮันเตอร์)",
            "He is from Thailand. He can speak fluently in Thai, Chinese, Korean, Japanese, and English. He and Yujun only have a 20, or 30 minute age difference, with Hunter being the youngest. His best skill is his dancing.",
            "https://kprofiles.com/wp-content/uploads/2023/02/53942B04-5A50-4469-B54A-F911ACB4FA44-900x711.jpeg"
        )
    )


    val listData: ArrayList<Member>
        get() {
            val list = arrayListOf<Member>()
            for (aData in data) {
                val member = Member()
                member.name = aData[0]
                member.from = aData[1]
                member.photo = aData[2]

                list.add(member)
            }
            return list
        }
}
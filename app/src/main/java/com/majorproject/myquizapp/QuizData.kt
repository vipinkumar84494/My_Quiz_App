package com.majorproject.myquizapp

object QuizData {

    fun getQuestions(): ArrayList<Questions> {

        val questionsList = ArrayList<Questions>()

        val que1 = Questions(
                1, "What country dose this flag belong to? ",
                R.drawable.ic_flag_of_argentina,
                "Argentina", "Austrialia",
                  "Armenia", "Austria",
                1
        )
        questionsList.add(que1)

        val que2 = Questions(
                1, "What country dose this flag belong to? ",
                R.drawable.ic_flag_of_australia,
                "Japan", "Austrialia",
                "Armenia", "Austria",
                2
        )
        questionsList.add(que2)

        val que3 = Questions(
                1, "What country dose this flag belong to? ",
                R.drawable.ic_flag_of_belgium,
                "Belgium", "New Zealand",
                "Panama", "Maldives",
                1
        )
        questionsList.add(que3)

        val que4 = Questions(
                1, "What country dose this flag belong to? ",
                R.drawable.ic_flag_of_brazil,
                "Cuba", "Jordan",
                "Armenia", "Brazil",
                4
        )
        questionsList.add(que4)

        val que5 = Questions(
                1, "What country dose this flag belong to? ",
                R.drawable.ic_flag_of_denmark,
                "Egypt", "Germany",
                "Denmark", "Bahrain",
                3
        )
        questionsList.add(que5)

        val que6 = Questions(
                1, "What country dose this flag belong to? ",
                R.drawable.ic_flag_of_fiji,
                "Fiji", "Georgia",
                "Canada", "Philippines",
                1
        )
        questionsList.add(que6)

        val que7 = Questions(
                1, "What country dose this flag belong to? ",
                R.drawable.ic_flag_of_germany,
                "China", "Peru",
                "Germany", "Philippines",
                3
        )
        questionsList.add(que7)

        val que8 = Questions(
                1, "What country dose this flag belong to? ",
                R.drawable.ic_flag_of_india,
                "India", "Shri Lanka",
                "Pakistan", "Philippines",
                1
        )
        questionsList.add(que8)

        val que9 = Questions(
                1, "What country dose this flag belong to? ",
                R.drawable.ic_flag_of_kuwait,
                "Oman", "Georgia",
                "Pakistan", "Kuwait",
                4
        )
        questionsList.add(que9)

        val que10 = Questions(
                1, "What country dose this flag belong to? ",
                R.drawable.ic_flag_of_new_zealand,
                "Oman", "New Zealand",
                "Chad", "Norway",
                2
        )
        questionsList.add(que10)


        return questionsList
    }
}
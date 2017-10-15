package io.github.omfgshaz.factchecc.data.repository;

import java.util.ArrayList;

import io.github.omfgshaz.factchecc.data.model.Article;

public class DemoRepository {

    public static ArrayList<Article> data = new ArrayList<>();

    static {
        data.add(new Article("", "http://www.juronggrc.sg/sites/default/files/images/Halimah%20Yacob-blue-2R.jpg", "Halimah Yaccob is Singapore's first female president", "body", 98));
        data.add(new Article("", "http://media.theindependent.sg/wp-content/uploads/2017/08/halimah_yacob_indian_muslim_father_presidential_election-1.jpg", "Halimah Yaccob is an Indian not a Malay", "body", 12));
        data.add(new Article("", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0e/Donald_Trump_Pentagon_2017.jpg/435px-Donald_Trump_Pentagon_2017.jpg", "Donald Trump to impose sanctions on Singapore", "body", 44));
        data.add(new Article("", "https://i2.wp.com/mustsharenews.com/wp-content/uploads/2017/02/Yishun-Wall-v2.jpg?fit=900%2C453&ssl=1", "Halimah Yacob is going to build a wall around yishun", "", 69));
        data.add(new Article("", "http://static.straitstimes.com.sg/sites/default/files/styles/article_pictrure_780x520_/public/articles/2017/10/13/file6x3ehdef2qvb12ll23e.jpg?itok=9ePBpnT1", "SPH starts retrenching staff", "", 14));
    }

}

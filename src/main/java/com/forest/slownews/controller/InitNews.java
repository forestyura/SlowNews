package com.forest.slownews.controller;

import com.forest.slownews.model.News;

import java.util.ArrayList;

/**
 * Created by Forest on 26.03.2016.
 */
public class InitNews {
    private ArrayList<News> news;

    private News news1 = new News("Chinese flags defaced in Prague ahead of Xi visit",
            " Dozens of the flags hung in the capital Prague were \"spattered with a black substance overnight\", a police spokesman said.\n" +
                    "The Chinese leader is due to arrive on Monday for a two-day visit before going to the US for talks on nuclear issues.\n" +
                    "Czech demonstrators who oppose China's policies in Tibet are expected to stage protests during the trip.\n" +
                    "They also plan to hang a giant photo of exiled Tibetan spiritual leader the Dalai Lama near the airport alongside one of former Czech President Vaclav Havel, a former dissident and human rights activist.\n" +
                    "Rights groups have accused China of suppressing Tibetan culture and freedom of expression.\n" +
                    "The Chinese government says Tibet's economy has developed considerably under its rule.",
            "image/news1.jpg");

    private News news2 = new News("Savchenko case: Will Kremlin release Ukraine pilot?",
            " For most people in the small, provincial courtroom the verdict on Tuesday was never in doubt.\n" +
                    "But now Nadiya Savchenko has been declared guilty and sentenced to 22 years behind bars, international pressure for her release is mounting.\n" +
                    "\"For Nadiya it makes no difference whether she got 10 or 20 years. She is convinced the only way she will be set free is through political negotiations,\" one of her lawyers, Nikolai Polozov, told the BBC outside court.\n" +
                    "His colleagues say talks are already under way for her release, though they gave no details.",
            "image/news2.jpg");

    private News news3 = new News("A new threat in the mountains of Transylvania",
            " The tradition of transhumance - the seasonal movement of sheep - is still practised in Romania. But shepherds say a law restricting the number of sheepdogs they are allowed to use could threaten their way of life.\n" +
                    "\"Do you want to see my house?\" asks Ion at the door of the cowshed. I'm a bit nonplussed. We'd just been inside his house, on the sofa in the best room eating cake and poring over photo albums.\n" +
                    "\"No, no!\" he says noticing my confusion. \"I mean my real house!\" He lifts a shaggy grey fleece off a wooden peg and throws it over his shoulders. The sleeveless sarica, as it's called, is made of four sheepskins sewn together. When I try it on, the cloak comes down to my ankles and is so heavy I can barely stand. But suddenly I'm immune to the knife sharp wind blowing off the mountains. \"I slept in that even when it was snowing,\" says Ion. \"Very cosy.\"",
            "image/news3.jpg");

    public ArrayList<News> getNews() {
        news = new ArrayList<>();
        news.add(news1);
        news.add(news2);
        news.add(news3);
        return news;
    }
}

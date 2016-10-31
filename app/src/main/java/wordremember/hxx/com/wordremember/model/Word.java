package wordremember.hxx.com.wordremember.model;

/**
 * Created by Song Congying on 2016/10/24.
 * 单词的英文，翻译，音频等
 */
public class Word {

    /** 表名 */
    public static final String TABLE_NAME = "word_table";
    /** 英文单词名称 */
    public static final String ENGLISH_WORD = "word";
    public static final String PHONETIC = "phonetic";
    public static final String TRANSLATION = "translation";
    public static final String RADIO = "radio";
    public static final String PICTURE = "picture";
    public static final String SEPARATE = "separate";
    public static final String IMAGE = "image";
    public static final String SHORTSENTANCE = "shortinstance";
    public static final String SENTANCE = "sentance";
    public static final String ISHAVEREAD = "ishaveread";
    public static final String ISTRUE = "istrue";
    public static final String WHICHDAY = "whichday";
    public static final String ISJIEDUANTEST = "isjieduantest";
    public static final String ISDAYCE = "isdaytest";

    private String englishWord;
    //音标
    private String phonetic;
    //翻译
    private String translation;
    //音频
    private String radio;
    private String picture;
    //拆分
    private String separete;
    //联想
    private String image;
    //短语
    private String shortSentance;
    //例句
    private String sentance;
    //读过了吗
    private int isHavaRead;
    //对了吗
    private int isTrue;
    //哪一天读的，依次顺延，1,2,3,4,5
    private int whichDay;
    //是否属于阶段测单词,是true
    private boolean isJieDuanTest;
    //是否属于日测单词，是true
    private boolean isDayTest;

    public Word(String englishWord, String phonetic, String translation, String radio, String picture, String separete, String image, String shortSentance, String sentance, int isHavaRead, int isTrue, int whichDay, boolean isJieDuanTest, boolean isDayTest) {
        this.englishWord = englishWord;
        this.phonetic = phonetic;
        this.translation = translation;
        this.radio = radio;
        this.picture = picture;
        this.separete = separete;
        this.image = image;
        this.shortSentance = shortSentance;
        this.sentance = sentance;
        this.isHavaRead = isHavaRead;
        this.isTrue = isTrue;
        this.whichDay = whichDay;
        this.isJieDuanTest = isJieDuanTest;
        this.isDayTest = isDayTest;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }

    public String getPhonetic() {
        return phonetic;
    }

    public void setPhonetic(String phonetic) {
        this.phonetic = phonetic;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getSeparete() {
        return separete;
    }

    public void setSeparete(String separete) {
        this.separete = separete;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getShortSentance() {
        return shortSentance;
    }

    public void setShortSentance(String shortSentance) {
        this.shortSentance = shortSentance;
    }

    public String getSentance() {
        return sentance;
    }

    public void setSentance(String sentance) {
        this.sentance = sentance;
    }

    public int getIsHavaRead() {
        return isHavaRead;
    }

    public void setIsHavaRead(int isHavaRead) {
        this.isHavaRead = isHavaRead;
    }

    public int getIsTrue() {
        return isTrue;
    }

    public void setIsTrue(int isTrue) {
        this.isTrue = isTrue;
    }

    public int getWhichDay() {
        return whichDay;
    }

    public void setWhichDay(int whichDay) {
        this.whichDay = whichDay;
    }

    public boolean isJieDuanTest() {
        return isJieDuanTest;
    }

    public void setJieDuanTest(boolean jieDuanTest) {
        isJieDuanTest = jieDuanTest;
    }

    public boolean isRiCeTest() {
        return isDayTest;
    }

    public void setRiCeTest(boolean riCeTest) {
        isDayTest = riCeTest;
    }
}

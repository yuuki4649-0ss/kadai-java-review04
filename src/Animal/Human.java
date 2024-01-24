package Animal;

public class Human extends Animal implements Thinkable {

    //フィールド
    private String hobby; //趣味

    // 引数ありのコンストラクタ
    public Human(String name, int age, String hobby) { // 名前、年齢、趣味
        super(name, age); // スーパークラスのコンストラクタの呼び出し
        this.hobby = hobby;
    }

    @Override
    public void think() {
        System.out.println("私は" + this.hobby + "について考えています。");

    }

}
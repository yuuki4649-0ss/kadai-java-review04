package Animal;

public class Animal {

    // フィールド
    private String name; // 名前
    private int age; // 歳

    //　引数ありのコンストラクタ
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void say() {
        System.out.println(this.name + "です。" + this.age + "歳です。");
    }

}
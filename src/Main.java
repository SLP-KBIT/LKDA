import javax.swing.JApplet;

public class Main extends JApplet {
  public static void main(String[] args) {
    /*Slime baka = new Slime();
    baka.hoge();

    System.out.println(baka.eneMHP);
    System.out.println("ある塔の最上階に伝説の幼女がいるという。");
    System.out.println("この噂を聞いたKNYNは、伝説の幼女を求め、冒険の旅に出た!");
    System.out.println("そして、KNYNはついに塔にたどり着いた!");
    System.out.println("期待に○○を膨らませたKNYNの戦いが、今始まる!");
    System.out.println("警備兵やモンスター、強豪ロリコンがひしめく塔をKNYNは制覇できるのか!");*/
    Run game = new Run();
    game.runGame();
  }
}

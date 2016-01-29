package PAST;

public class Map {
  final int Floor = 10;    // 塔の高さのマクロ

  int [] map = new int[Floor];           // 塔の高さを指定してダンジョンの作成

  //---- マップを作成
  void makeMap() {
    for ( int i = 0; i < Floor; i++ ) {
      map[i] = new java.util.Random().nextInt(2);
    }
  }
}

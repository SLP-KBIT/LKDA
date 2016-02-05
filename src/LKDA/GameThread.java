package LKDA;
//====================================================================
//                  ゲームの詳細な流れを規定するクラス
//====================================================================
public class GameThread extends Thread{
  boolean end = false;     // 終了確認用フラグ
  boolean stop = false;    // 一時停止確認用フラグ
  int time;

  public GameThread(int time) {
    this.time = time;
  }

  @Override
  public void run() {
    MainPanel.mp.setMessage(1,0,1);
    while ( ! end ) {
      MainPanel.mp.setMessage(0,0,0);
      this.stopRun();
      try {
        Thread.sleep(time);
        synchronized(this) {
          if ( stop ) wait();
        }
      } catch ( InterruptedException e ) {
        e.printStackTrace();
      }
      MainPanel.enemy.attack(MainPanel.player);
    }
  }

  //-- スレッドを一時停止する
  public void stopRun() {
    stop = true;
  }

  //-- スレッドを再開する
  public synchronized void setStop() {
    stop = ! stop;
    if ( ! stop ) {
      notify();
    }
  }
}

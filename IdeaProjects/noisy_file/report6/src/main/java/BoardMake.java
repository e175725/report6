import java.util.Arrays;

//将棋盤を表示するクラス
public class BoardMake {
    String[][] block; //２次元配列のblockを用意

    public BoardMake(){

    }
    //将棋盤の基盤となるものを２次元配列で表示するメソッド
    public void MakeBoard(){
        block = new String[19][19];
        int i,f,g,h,j,k,l,p,t,m;
        for(i=0; i<19 ;i++){
            block[0][i] = "ー";
        }
        for(t=1;t<19;t++){
            block[t][0]="｜";
        }
        for(g=1;g<19;g=g+2) {
            for (h=1,j=2 ; h < 19; h=h+2,j=j+2) {
                block[g][j] = "｜";
                block[g][h] = "　";
            }
        }
        for(k=2;k<17;k=k+2) {
            for (l=2,p=1 ; l < 19; l=l+2,p=p+2) {
                block[k][p] = "ー";
                block[k][l] = "＋";
            }
        }
        for(m=1;m<19;m++){
            block[m][18]="｜";
        }
        for(f=0; f<19 ;f++){
            block[18][f] = "ー";
        }
    }

    //MakeBoardメソッドで作った配列を実際に使える形へプリントするメソッド
    public void PrintBoard(){
        int n;
        MakeBoard();
        for(n=0;n<19;n++){
            String[] test = block[n];
            String test2 = String.join("",test);
            System.out.println(test2);
        }
    }

}

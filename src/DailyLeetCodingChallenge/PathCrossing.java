package DailyLeetCodingChallenge;

import java.util.HashSet;
import java.util.Set;

public class PathCrossing {
    int x =0;
    int y=0;
    PathCrossing(int x,int y){
        this.x =x;
        this.y = y;
    }
    PathCrossing(){
    }
    public boolean equals(Object obj){
        PathCrossing s = (PathCrossing) obj;
        return (x == s.x && y == s.y);
    }
    public int hashCode(){
        return x * 100000 + y;
    }
    public String toString(){
        return "("+x +" ,  "+y+")";
    }
    public boolean isPathCrossing(String path) {
        int tbC = 0;
        int lrC = 0;
        Set<PathCrossing> map = new HashSet<>();
        PathCrossing s = new PathCrossing(0,0);
        map.add(s);
        for(char c: path.toCharArray()){
            if(c == 'N'){
                tbC++;
            }else if(c == 'S'){
                tbC--;
            }else if(c == 'E'){
                lrC++;
            }else{
                lrC--;
            }
            s = new PathCrossing(lrC,tbC);
            if(map.contains(s)){
                return true;
            }
            map.add(s);
        }

        return false;
    }
}
package tdd.cyaan3;

public class Chandrayaan3 {
    private static int x_coordinate=0;
    private static int y_coordinate=0;
    private static int z_coordinate=0;

    public static int[] coordinates={x_coordinate,y_coordinate,z_coordinate};
    private static char directionFacing='N';
    public static int[] finalPosition(String[] commands){
        int[] coords=coordinates;
        for(String str:commands){
            String st=str.toLowerCase();
            if(st.equals("f")){
                if(directionFacing=='N')
                    coords[1]++;
                if(directionFacing=='S')
                    coords[1]--;
                if(directionFacing=='W')
                    coords[0]--;
                if(directionFacing=='E')
                    coords[0]++;
                if(directionFacing=='U')
                    coords[2]++;
                if(directionFacing=='D')
                    coords[2]--;
            }
            if(st.equals("b")){
                if(directionFacing=='N')
                    coords[1]--;
                if(directionFacing=='S')
                    coords[1]++;
                if(directionFacing=='W')
                    coords[0]++;
                if(directionFacing=='E')
                    coords[0]--;
                if(directionFacing=='U')
                    coords[2]--;
                if(directionFacing=='D')
                    coords[2]++;
            }
            if(st.equals("l")){
                directionFacing='W';
            }
            if(st.equals("r")){
                directionFacing='E';
            }
            if(st.equals("u")){
                directionFacing='U';
            }
            if(st.equals("d")){
                directionFacing='D';
            }
        }
        return coordinates;
    }

}

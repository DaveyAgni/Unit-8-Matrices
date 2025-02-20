//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	int total = 0;
        int[][]tot = {{m.length - 1},{0}};

        for(int i = 0; i < m.length; i++)
        {
            for(int c = 0; c < m[i].length; c++)
            {
                total += m[i][c];
            }
            tot[i][0] = total;
            total = 0;
        }

        List<Integer> list = new ArrayList<Integer>();
        for(int d = 0; d < tot.length; d++)
        {
            list.add(tot[d][0]);
        }
		
        return list;
    }
}

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Biggest
{
    public static int getBig(int[][] m)
    {
		int inital = m[0][0];

        for(int i = 0; i < m.length; i++)
        {
            for(int c = 0; c < m[i].length; c++)
            {
                if(m[i][c] > inital)
                {
                    inital = m[i][c];
                }
            }
        }

        return inital;
    }
}

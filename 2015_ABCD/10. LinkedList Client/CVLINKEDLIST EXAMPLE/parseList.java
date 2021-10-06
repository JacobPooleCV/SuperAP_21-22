public class parseList
{
	private String fName,s,lt,ft;
	private char c;
	private EasyReader inFile;
	private int m,d;
	private Container tempb;
	private CVLinkedList temp = new CVLinkedList();

	public parseList(String fO)
	{
		fName = fO;
		inFile = new EasyReader(fName);
	}

	public CVLinkedList get()
	{
		c = inFile.readChar();
		while(!inFile.eof())
		{
			//System.out.println("Loop Continues");
			while(c!=':')
			{
				s += c;
				c = inFile.readChar();
			}
			lt = s;
			s = "";
			c = inFile.readChar();

			while(c!=':')
			{
				s += c;
				c = inFile.readChar();
			}
			ft = s;

			m = inFile.readInt();
			d = inFile.readInt();

			tempb = new Container(lt,ft,m,d);
			temp.add(tempb);

			s = "";

			String sc = inFile.readLine();
			c = inFile.readChar();
		}

		return temp;
	}
}
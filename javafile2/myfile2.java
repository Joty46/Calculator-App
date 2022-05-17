package javafile2;
public class myfile2{
    int id;
    string n;
    myfile2(string s,int r)
    {
        id=r;
        n=s;
    }
    public void setRoll(int r)
    {
        id=r;
    }
    public int getRoll()
    {
        return id;
    }
    public void setName(string s)
    {
        n=s;
    }
    public string getName()
    {
        return n;
    }
}
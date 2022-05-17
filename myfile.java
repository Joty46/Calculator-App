package javafile;
public class myfile{
    int roll;
    string name;
    myfile(string s,int r)
    {
        roll=r;
        name=s;
    }
    public void setRoll(int r)
    {
        roll=r;
    }
    public int getRoll()
    {
        return roll;
    }
    public void setName(string s)
    {
        name=s;
    }
    public string getName()
    {
        return name;
    }
}
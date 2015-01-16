package pkgclass.skeleton.generator;


import java.util.ArrayList;

public class Constructor
{
    private ArrayList<Variable> _vars;
    private String _name;
    public Constructor(ArrayList<Variable> vars, String name)
    {
        _vars = vars;
        _name = name;
    }
    public String getConstructor()
    {
        String temp = "\tpublic " + _name + "(";
        for(int i = 0; i<_vars.size()-2; i++)
        {
            temp += String.format("%s %s,", _vars.get(i).getType(),_vars.get(i).getName());
        }
        temp += String.format("%s %s)\n\t{\n\t\t", _vars.get(_vars.size()-1).getType(),_vars.get(_vars.size()-1).getName());
        for(Variable var : _vars)
        {
            temp += String.format("_%s = %s;\n\t\t", var.getName(),var.getName());
        }
        temp = temp.substring(0, temp.length()-2);
        temp += "\t";
        temp += "}";
        return temp;
    }

}
package pkgclass.skeleton.generator;




import java.util.HashMap;
import java.util.Map;

public class Variable
{
    private static Map<String, Variable> Variables = new HashMap<String, Variable>();
    private boolean _array;
    private boolean _arrayList;
    private boolean _get;
    private boolean _set;
    private boolean _retrievable;
    private String _name;
    private String _type;
    private String _className;
    private Variable(String type, String name, boolean array, boolean arrayList, boolean get, boolean set, boolean retrievable, String className)
    {
        _type = type;
        _name = name;
        _array = array;
        _arrayList = arrayList;
        _get = get;
        _set = set;
        _retrievable = retrievable;
        _className = className;
        Variables.put(type+name, this);
    }
    public static Variable Create(String type, String name,boolean array, boolean arrayList, boolean get, boolean set, boolean retrievable, String className)
    {
        Variable temp = Variables.get(type+name);
        if (temp == null)
        {
            temp = new Variable(type, name, array, arrayList, get, set, retrievable, className);
        }
        return temp;
    }
    public static void Remove(Variable v)
    {
        Variables.remove(v.getType()+v.getName());
    }
    
    public String getDeclaration()
    {
        String temp = new String();
        if (_retrievable)
            temp += String.format("\tprivate static Map<String, %s> %ss = new HashMap<String, %s>()\n", _className,_className,_className);
        if(_array)
        {
            temp += String.format("\tprivate %s[] _%s;", _type, _name);
        }
        else if(_arrayList)
        {
            temp += String.format("\tprivate ArrayList<%s> _%s;", _type, _name);
        }
        else
        {
            temp += String.format("\tprivate %s _%s;", _type, _name);
        }
        return temp;
    }
    public String getGetter()
    {
        if(_get)
            return String.format("\tpublic %s get%s()\n\t{\n\t\treturn _%s;\n\t}", _type, _name.substring(0, 1).toUpperCase() + _name.substring(1), _name);
        else
            return null;
    }
    public String getSetter()
    {
        if(_set)
            return String.format("\tpublic void set%s(%s %s)\n\t{\n\t\t_%s = %s;\n\t}", _name.substring(0, 1).toUpperCase() + _name.substring(1), _type, _name, _name, _name);
        else
            return null;
    }
    public String getType()
    {
        return _type;
    }
    public String getName()
    {
        return _name;
    }
    public boolean getGet()
    {
        return _get;
    }
    public boolean getSet()
    {
        return _set;
    }
    public boolean getArray()
    {
        return _array;
    }
    public boolean getRetrievable()
    {
        return _retrievable;
    }
    public boolean getArrayList()
    {
        return _arrayList;
    }
}

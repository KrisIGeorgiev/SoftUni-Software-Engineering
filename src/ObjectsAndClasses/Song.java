package ObjectsAndClasses;

public class Song {
    private String typeList;
    private String name;
    private String time;


    public Song(String typeList,String  name,String  time) {
        this.typeList = typeList;
        this.name = name;
        this.time = time;

    }

    public String getTypeList() {
        return this.typeList;
    }
    public void setTypeList (){
        this.typeList = typeList;
    }
    public String getName () {
        return this.name;
    }
    public void setName () {
        this.name = name;
    }
    public String getTime() {
        return this.time;
    }
    public void setTime () {
        this.time = time;
    }

}

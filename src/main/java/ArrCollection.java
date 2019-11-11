public class ArrCollection implements CustomCollection {
    String arrCollection[];
    int counter = 0;

    public ArrCollection() {
        arrCollection = new String[10];
    }

    public String[] getLargerCollectionByOne() {
        String newArrCollection[] = new String[arrCollection.length + 1];
        for (int i = 0; i < counter; i++){
            newArrCollection[i] = arrCollection[i];
        }
        return newArrCollection;
    }


    public boolean add(String str) {
        if(counter+1>arrCollection.length)
            arrCollection=getLargerCollectionByOne();
        arrCollection[counter]=str;
        counter++;
        return true;
    }



    public boolean addAll(ArrCollection strColl) {
        for(int i=0;i<counter;i++)
            add(strColl.arrCollection[i]);
        return true;
    }


    public boolean delete(int index) {
        arrCollection[index]=null;
        for(;index+1<arrCollection.length;index++)
            arrCollection[index]=arrCollection[index+1];
        counter--;
        return true;
    }


    public boolean delete(String str) {
        for (int i=0;i<counter;i++){
            if(arrCollection[i].equals(str))
                delete(i);
            return true;
        }
        return false;
    }


    public String get(int index) {
        return arrCollection[index];
    }


    public boolean contains(String str) {
        boolean flag = true;
        for(int i=0;i<counter;i++){
            if(arrCollection[i]!=str)
                flag=false;
        }
        return flag;
    }


    public boolean clear() {
        for(int i=0;i<counter;i++){
            arrCollection[i]=null;
        }
        counter=0;
        return true;
    }

    public int size() {
        return counter;
    }


    public boolean trim() {
        String tempArr[]=new String[counter];
        for(int i=0;i<counter;i++){
            tempArr[i]=arrCollection[i]; }
        arrCollection=tempArr;
        return true;
    }


    public boolean compare(ArrCollection coll) {
        if(this.counter!=coll.getCount() || coll.arrCollection.length!=this.arrCollection.length)
            return false;
        for(int i=0;i<counter;i++){
            if(this.arrCollection[i]!=coll.arrCollection[i])
                return false;
        }
        return true;
    }

    public int getCount() {
        return counter;
    }
    public String[] getLargerCollection() {
        String newArrCollection[] = new String[arrCollection.length +Math.round(arrCollection.length *2/3)];//округляем новую размерность массива
        for (int i = 0; i < counter; i++) {
            newArrCollection[i] = arrCollection[i];
        }
        return newArrCollection;
    }
}


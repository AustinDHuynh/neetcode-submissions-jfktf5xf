class DynamicArray {
        int[] array;
        int length;
    public DynamicArray(int capacity) {
        length = 0;
        if(capacity > 0){
            array = new int[capacity];  
        } else{
            array = new int[0];
        }    
    }

    public int get(int i) {
        return array[i];
    }

    public void set(int i, int n) {
        while(i > getCapacity()){
            resize();
        }
        
        if(i >= 0 && i < getCapacity()){
            array[i] = n;
            if(i > length){
            length = i;
            }
        }
        
    }

    public void pushback(int n) {
        if(getSize() >= getCapacity()){
            resize();
        }
        array[getSize()] = n;
        length++;
    }

    public int popback() {
        int temp = array[getSize() - 1];
        array[getSize() - 1] = 0;
        length--;
        return temp;
        
    }

    private void resize() {
        int [] tempArray = new int[array.length*2];
        for(int i = 0; i < array.length; i++){
            tempArray[i] =  array[i];
        }
        array = tempArray;
        
    }

    public int getSize() {
        return length;
    }

    public int getCapacity() {
        return array.length;
    }
}

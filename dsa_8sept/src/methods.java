class methods {

    public void display(int[] array) {
        System.out.println("<=======================================>");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println("<=======================================>");
    }

    //removal

    public void remove_element(int[] array, int index, int size) {

        if (index < 0 || index > array.length) {
            System.out.println("Invalid input: ");
            return;
        }
        for (int i = index; i <= size; i++) {

            array[i] = array[i + 1];
        }
        array[size] = 0;


    }

    public void remove_last(int[] array, int size) {
        array[size] = 0;
        size--;
    }
   public void remove_first(int[]array,int size){

        if(size== 0){
            System.out.println("empty array!");
        }
        for(int i=0;i<size;i++){
            array[i] = array[i + 1];
        }
        array[0] =0;
        array[size]= 0;
   }

//insertion

    public void add_first(int [] array , int size , int element){
        for(int i = size; i >= 0; i--){
            array[i + 1] = array[i];
        }
        array[0] = element;

    }
    public void add_at_index(int[] array, int size, int index, int element) {
        if (index < 0 || index > size || size >= array.length) {
            System.out.println("Cannot insert element.");
            return;
        }
        for (int i = size; i >= index; i--) {
            array[i + 1] = array[i];

        }
        array[index] = element;

    }

    public void add_at_last(int[] array, int size, int element) {
        for (int i = 0; i <= size; i++) {
            if (i == size) {
                array[i] = element;
            }
        }
        size++;
    }


// search

    public int search_by_index(int[] array, int size, int index) {
        int temp = 0;
        for (int i = 0; i < size; i++) {
            if (i == index) {
                temp = array[i];
            }
        }
        return temp;
    }

    public int search_by_element(int[] array, int size, int element) {
        int temp = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                temp = array[i];
            }
        }
        return temp;
    }
}



package com.TiposDeDatoAvanzados;

public class DynArray {


        private int size = 3;
        private int pos = 0;
        private Object[] elements;

        public DynArray(){
            elements = new Object[size];
        }

        public void add(Object o){
            if (pos >=size){
                arrayExpand();

            }
            elements[pos++] = o;
        }

        public int size(){
            return this.size;
        }

        public int length(){
            return pos;
        }

        public Object get(int pos){
            return elements[pos];

        }
        public void arrayExpand(){
            size *=2;

            Object []aux = new Object[size];
            for (int i = 0; i < elements.length; i++){
                aux[i] = elements[i];
                elements[i] = null;
            }

            elements = new Object[size];
            for (int i = 0; i< elements.length;i++){
                elements[i] = aux[i];
            }
        }


    public static void main(String[] args) {
        DynArray da = new DynArray();
        da.add(1);
        da.add(2);
        da.add(3);
        da.add(4);
        da.add(5);
        da.add(6);
        da.add(7);

        System.out.println(da.length());
        System.out.println(da.size());

        for (int i = 0; i < da.length();i++) {
            System.out.println("tengo:" +da.get(i));

        }




    }

}

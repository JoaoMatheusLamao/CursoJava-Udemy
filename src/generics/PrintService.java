package generics;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

    private List<T> lista = new ArrayList<>();

    public void addValue(T value){
        lista.add(value);
    }

    public T first(){
        if (lista.size() < 1){
            throw new IllegalArgumentException("Lista vazia!");
        }
        return lista.get(0);
    }

    public void print(){
        System.out.print("[");
        if (lista.size() < 1){
            System.out.print("]");
            return;
        } else {
            System.out.print(lista.get(0));
            for (int i = 1; i < lista.size(); i++){
                if ((i == lista.size())) {
                    System.out.print(lista.get(i));
                } else {
                    System.out.print(", " + lista.get(i));
                }
            }
        }
        System.out.print("]");
    }

}

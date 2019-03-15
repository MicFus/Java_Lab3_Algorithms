package Task1;
import java.util.Iterator;
import java.util.Random;

// Stwórz, iterowalną klasę Matrix opartą o istniejące kolekcje wraz z metodą pozwalającą
// dodawać macierze (zgodnie z zasadami dodawania macierzy). Pokaż, że dodawanie zadziała.
// Wykorzystaj iterator do wypisania macierzy na ekran.

public class Matrix implements Iterable<Integer> {
    private int _sizeX, _sizeY;
    private int iterator = -1;
    private Integer[][] IntegerArray;

    public Matrix(int sizeX, int sizeY) {
        _sizeX = sizeX;
        _sizeY = sizeY;
        IntegerArray = new Integer[_sizeX][];
        for (int i = 0; i < _sizeX; i++) {
            IntegerArray[i] = new Integer[_sizeY];
        }
    }

    public Integer Get(int x, int y) throws Exception {
        if (x >= _sizeX || y >= _sizeY) {
            throw new Exception("Index out of range");
        }
        return IntegerArray[x][y];
    }

    public void RandomFill(int min, int max) {
        Random random = new Random();
        for (int i = 0; i < _sizeX; i++) {
            for (int j = 0; j < _sizeY; j++) {
                IntegerArray[i][j] = min + random.nextInt(max - min);
            }
        }
        return;
    }

    public Matrix Add(Matrix matrix) throws Exception {

        if (_sizeY == matrix._sizeY) {
            if (_sizeX == matrix._sizeX) {
                Matrix newMatrix = new Matrix(_sizeX, _sizeY);
                for (int i = 0; i < _sizeX; i++) {
                    for (int j = 0; j < _sizeY; j++) {
                        newMatrix.IntegerArray[i][j] = IntegerArray[i][j] + matrix.IntegerArray[i][j];
                    }
                }
                return newMatrix;
            }
        }
        throw new Exception();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return iterator < (_sizeX * _sizeY)-1;
            }
            @Override
            public Integer next() {
                if (hasNext()) {
                    ++iterator;
                    return IntegerArray[(iterator-iterator%_sizeY) / _sizeY][iterator % _sizeY];
                }
                return null;
            }
        };
    }

    public void Display(){
        System.out.println();
        for(int i=0; i<_sizeX; i++){
            for(int j=0; j<_sizeY; j++){
                System.out.print(" " + IntegerArray[i][j]);
            }
            System.out.println();
        }
    }
}
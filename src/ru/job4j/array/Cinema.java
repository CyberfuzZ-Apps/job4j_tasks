package ru.job4j.array;

import java.util.Objects;

public class Cinema {
    public static Place checkEmptyPlace(Place[][] places) {
        int row = 0;
        int cell = 0;
        int count = 0;
        for (int i = 0; i < places.length - 1; i++) {
            for (int j = 0; j < places[i].length - 1; j++) {
                if (places[i][j] == null
                        && places[i][j + 1] == null
                        && places[j + 1][i] == null) {
                    row = i;
                    cell = j;
                    count++;
                }
            }
        }
        if (count != 0) {
            return new Place(row, cell);
        } else {
            return null;
        }
    }

    public static class Place {
        private int row;

        private int cell;

        public Place(int row, int cell) {
            this.row = row;
            this.cell = cell;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Place place = (Place) o;
            return row == place.row
                    && cell == place.cell;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, cell);
        }
    }
}

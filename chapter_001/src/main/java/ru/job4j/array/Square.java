package ru.job4j.array;

public class Square {
    public int [] calculate(int bound) {
        int[] rst = new int[bound];
        for(int i = 1;i < bound; i++){   // ��������� ������ ����� ���� ���������� �� 1 �� bound ������������ � �������
          rst[i] = i*i;
        }
        return rst;
    }
}

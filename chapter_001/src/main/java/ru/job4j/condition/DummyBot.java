package ru.job4j.condition;

/**
 * DummyBot.
 */
public class DummyBot {
    /**
     * �������� �� �������.
     * @param question ������ �� �������.
     * @return �����.
     */
    public String answer(String question) {
        String rsl = "��� ������ ���� � �����. ������� ������ ������.";
        if ("������, ���.".equals(question)) {
            // �������� ... �� ���������� ����� rsl = "����� �� �������".
            rsl = "������, �����.";
        } else if ("����.".equals(question)) { // �������� ... �� ��������, �������� �� ���� ���� ������ � �� ����� ��� �� ���� ��������.
            // �������� ... �� ���������� ����� rsl = "����� �� �������".
            rsl = "�� ������ �������.";
        }
        return rsl;
    }
}
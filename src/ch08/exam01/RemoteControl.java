package ch08.exam01;

public interface RemoteControl {
	//��� - �빮�ڷ� ���� ����, �� �ݵ�� �����ؾ� ��
	String COMPANY = "�Ｚ"; //�տ� public static final �����Ǿ� ����
	int MAX_VOULUME = 10;
	int MIN_VOULUME = 1;
	
	//�޼ҵ�(��ü ��� ����) -> ������ ��ü�� ����� �� �̷��� ����� �� �־�. �̷� ����
	void turnOn(); //�����{} ���� (�߻�Ŭ������ Ư���� ���� ����)
	void turnOff(); //�տ� public abstract �����Ǿ� ����
	void setVolume(int volume);

}

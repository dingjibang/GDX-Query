package demo;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.rpsg.gdxQuery.$;

public class SimpleGdxQueryDemo implements ApplicationListener {
	public static void main(String[] args) {
		new LwjglApplication(new SimpleGdxQueryDemo(),"demo",1024,576);
	}
	
	Stage stage;
	
	public void create() {
		stage=new Stage();
		
		//�����������ķ�ʽ������һ��Actor����Ȼ��������ã�������stage�
		//in the normal way to create a actor and add it to stage.
		Image image=new Image(new Texture(Gdx.files.internal("resource/data/badlogic.jpg")));
		image.setPosition(50, 60);
		image.setColor(1,1,0.3f,0.5f);
		stage.addActor(image);
		
		//����������GdxQueryģʽ������һ��GdxQuery���󣬲�ʹ������
		//now ,use GdxQuery to create a Actor and add to stage
		stage.addActor($.add(new Image(new Texture(Gdx.files.internal("resource/data/badlogic.jpg")))).setPosition(150, 160)
			.setColor(1,0.3f,1f,0.5f).getItem());
		
		//�����Լ�!
		//more simplified!
		$.image("resource/data/badlogic.jpg").setPosition(300, 300).appendTo(stage);
		
	}
	
	public void render() {
		stage.act();
		stage.draw();
	}

	public void dispose() {
		
	}
	
	public void pause() {
		
	}
	
	public void resize(int arg0, int arg1) {
		
	}

	public void resume() {
		
	}
}

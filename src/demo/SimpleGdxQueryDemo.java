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
		
		//以我们正常的方式，创建一个Actor对象，然后进行配置，最后放入stage里。
		//in the normal way to create a actor and add it to stage.
		Image image=new Image(new Texture(Gdx.files.internal("resource/data/badlogic.jpg")));
		image.setPosition(50, 60);
		image.setColor(1,1,0.3f,0.5f);
		stage.addActor(image);
		
		//现在我们用GdxQuery模式，创建一个GdxQuery对象，并使用它。
		//now ,use GdxQuery to create a Actor and add to stage
		stage.addActor($.add(new Image(new Texture(Gdx.files.internal("resource/data/badlogic.jpg")))).setPosition(150, 160)
			.setColor(1,0.3f,1f,0.5f).getItem());
		
		//还可以简化!
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

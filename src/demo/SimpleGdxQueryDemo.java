package demo;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.rpsg.gdxQuery.$;
import com.rpsg.gdxQuery.EventType;
import com.rpsg.gdxQuery.GdxQuery;
import com.rpsg.gdxQuery.GdxQueryRunnable;
import com.rpsg.gdxQuery.gQuery.IGQuery;

public class SimpleGdxQueryDemo implements ApplicationListener, InputProcessor, IGQuery{
	public static void main(String[] args) {
		new LwjglApplication(new SimpleGdxQueryDemo(),"demo",1024,576);
	}
	
	Stage stage;
	
	public void create() {
		stage=new Stage();
		
//		//以我们正常的方式，创建一个Actor对象，然后进行配置，最后放入stage里。
//		//in the normal way to create a actor and add it to stage.
//		Image image=new Image(new Texture(Gdx.files.internal("resource/data/badlogic.jpg")));
//		image.setPosition(50, 60);
//		image.setColor(1,1,0.3f,0.5f);
//		stage.addActor(image);
//		
//		//现在我们用GdxQuery模式，创建一个GdxQuery对象，并使用它。
//		//now ,use GdxQuery to create a Actor and add to stage
//		stage.addActor($.add(new Image(new Texture(Gdx.files.internal("resource/data/badlogic.jpg")))).setPosition(150, 160).setColor(1,0.3f,1f,0.5f).getItem());
//		
//		//还可以简化!
//		//more simplified!
//		GdxQuery q=$.image("resource/data/badlogic.jpg").setPosition(300, 300).appendTo(stage);
//		
//		//所有的query对象你都可以调用一个叫onClick的方法，传入一个runnable，当这个对象被单击的时候，将会执行runnable。
//		//any Query Object allow to use "onClick" method to give a click callback.
//		q.onClick(new Runnable() {
//			public void run() {
//				System.out.println("image was clicked!");
//			}
//		});
		
		// v0.3 use method
		$.add($.image("resource/data/badlogic.jpg"),$.image("resource/data/badlogic.jpg")).first().setColor(Color.RED).setPosition(50, 50).next().setColor(Color.GREEN).setPosition(200, 200).getFather().run(new GdxQueryRunnable() {
			public void run(GdxQuery self) {
				self.not(self.first());
			}
		}).appendTo(stage);
		
		//now use lambda, more  js like!!!
		$("resource/data/badlogic.jpg").on(EventType.CLICK, (query)-> {
		    System.out.println("hello");
		}).appendTo(stage);
	}
	
	public void render() {
		stage.act();
		stage.draw();
		Gdx.input.setInputProcessor(this);
	}

	public void dispose() { }
	
	public void pause() { }
	
	public void resize(int arg0, int arg1) { }

	public void resume() { }

	public boolean keyDown(int arg0) { return stage.keyDown(arg0); }

	public boolean keyTyped(char arg0) { return stage.keyTyped(arg0); }

	public boolean keyUp(int arg0) { return stage.keyUp(arg0); }

	public boolean mouseMoved(int arg0, int arg1) { return stage.mouseMoved(arg0, arg1); }

	public boolean scrolled(int arg0) { return stage.scrolled(arg0); }

	public boolean touchDown(int arg0, int arg1, int arg2, int arg3) { return stage.touchDown(arg0, arg1, arg2, arg3); }

	public boolean touchDragged(int arg0, int arg1, int arg2) { return stage.touchDragged(arg0, arg1, arg2); }

	public boolean touchUp(int arg0, int arg1, int arg2, int arg3) { return stage.touchUp(arg0, arg1, arg2, arg3); }
}
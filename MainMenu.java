//package com.mygdx.game;
//
//import com.badlogic.gdx.Game;
//import com.badlogic.gdx.Gdx;
//import com.badlogic.gdx.InputProcessor;
//import com.badlogic.gdx.Screen;
//import com.badlogic.gdx.graphics.GL20;
//import com.badlogic.gdx.graphics.OrthographicCamera;
//import com.badlogic.gdx.graphics.Texture;
//import com.badlogic.gdx.graphics.g2d.SpriteBatch;
//import com.badlogic.gdx.graphics.g2d.TextureRegion;
//import com.badlogic.gdx.scenes.scene2d.InputEvent;
//import com.badlogic.gdx.scenes.scene2d.InputListener;
//import com.badlogic.gdx.scenes.scene2d.Stage;
//import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
//import com.badlogic.gdx.utils.ScreenUtils;
//import com.badlogic.gdx.utils.viewport.ScreenViewport;
//
//public class MainMenu implements Screen {
//    SpriteBatch batch;
//    Texture img;
////    final TankStars game;
////    private Texture backgroundImage;
////    private TextureRegion backgroundTexture;
//    private Stage stage;
//    private Game game;
////    OrthographicCamera camera;
//
//    public MainMenu(Game agame) {
//        game=agame;
//        stage = new Stage(new ScreenViewport());
//
//        Object MyGdxGame;
//        TextButton newgame = new TextButton("New Game",TankStars.myskin);
//        newgame.setWidth(Gdx.graphics.getWidth()/3);
//        newgame.setHeight(Gdx.graphics.getHeight()/4-15);
//        newgame.setPosition(Gdx.graphics.getWidth()/2-newgame.getWidth()/2+(Gdx.graphics.getWidth()/4)+(Gdx.graphics.getWidth()/10),Gdx.graphics.getHeight()-(2* newgame.getHeight())+(Gdx.graphics.getHeight()/10)-15);
//        newgame.addListener(new InputListener(){
//            @Override
//            public void touchUp (InputEvent event, float x, float y, int pointer, int button) {
//                game.setScreen(new GameScreen(game));
//            }
//            @Override
//            public boolean touchDown (InputEvent event, float x, float y, int pointer, int button) {
//                return true;
//            }
//        });
//        batch = new SpriteBatch();
//        img = new Texture("BG.jpg");
//        stage.addActor(newgame);
//
//    }
//
//    @Override
//    public void show() {
//        Gdx.input.setInputProcessor(stage);
//    }
//    public void create () {
//
//    }
//    @Override
//    public void render(float delta) {
//        Gdx.gl.glClearColor(1, 1, 1, 1);
//        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//        batch.begin();
//        batch.draw(img, 0, 20,638,440);
//        batch.end();
//        stage.act();
//        stage.draw();
//
//    }
//
//
//    @Override
//    public void resize(int width, int height) {
//
//    }
//
//    @Override
//    public void pause() {
//
//    }
//
//    @Override
//    public void resume() {
//
//    }
//
//    @Override
//    public void hide() {
//
//    }
//
//    @Override
//    public void dispose() {
//        stage.dispose();
//        batch.dispose();
//        img.dispose();
//    }
//
//}
package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class MainMenu implements Screen {
    SpriteBatch batch;
    Texture img;
    //    final TankStars game;
//    private Texture backgroundImage;
//    private TextureRegion backgroundTexture;
    private Stage stage;
    private Game game;
//    OrthographicCamera camera;

    public MainMenu(Game agame) {
        game=agame;
        stage = new Stage(new ScreenViewport());

        Object MyGdxGame;
        TextButton newgame = new TextButton("New Game",TankStars.myskin);
        newgame.setWidth(Gdx.graphics.getWidth()/3);
        newgame.setHeight(Gdx.graphics.getHeight()/4-15);
        newgame.setPosition(Gdx.graphics.getWidth()/2-newgame.getWidth()/2+(Gdx.graphics.getWidth()/4)+(Gdx.graphics.getWidth()/10),Gdx.graphics.getHeight()-(2* newgame.getHeight())+(Gdx.graphics.getHeight()/10)-15);
        newgame.addListener(new InputListener(){
            @Override
            public void touchUp (InputEvent event, float x, float y, int pointer, int button) {
                game.setScreen(new GameScreen(game));
            }
            @Override
            public boolean touchDown (InputEvent event, float x, float y, int pointer, int button) {
                return true;
            }
        });


        TextButton SavedGame = new TextButton("Saved Games",TankStars.myskin);
        SavedGame.setWidth(Gdx.graphics.getWidth()/3+30);
        SavedGame.setHeight(Gdx.graphics.getHeight()/4-15);
        SavedGame.setPosition(Gdx.graphics.getWidth()/2-SavedGame.getWidth()/2+(Gdx.graphics.getWidth()/4)+(Gdx.graphics.getWidth()/10),Gdx.graphics.getHeight()-(2* SavedGame.getHeight())+(Gdx.graphics.getHeight()/10)-100);
        SavedGame.addListener(new InputListener(){
            @Override
            public void touchUp (InputEvent event, float x, float y, int pointer, int button) {
                game.setScreen(new GameScreen(game));
            }
            @Override
            public boolean touchDown (InputEvent event, float x, float y, int pointer, int button) {
                return true;
            }
        });

        TextButton Login = new TextButton("Login",TankStars.myskin);
        Login.setWidth(Gdx.graphics.getWidth()/3);
        Login.setHeight(Gdx.graphics.getHeight()/4-15);
        Login.setPosition(Gdx.graphics.getWidth()/2-Login.getWidth()/2+(Gdx.graphics.getWidth()/4)+(Gdx.graphics.getWidth()/10),Gdx.graphics.getHeight()-(2* Login.getHeight())+(Gdx.graphics.getHeight()/10)-180);
        Login.addListener(new InputListener(){
            @Override
            public void touchUp (InputEvent event, float x, float y, int pointer, int button) {
                game.setScreen(new Login(game));
            }
            @Override
            public boolean touchDown (InputEvent event, float x, float y, int pointer, int button) {
                return true;
            }
        });


        TextButton Quit = new TextButton("Exit",TankStars.myskin);
        Quit.setWidth(Gdx.graphics.getWidth()/3);
        Quit.setHeight(Gdx.graphics.getHeight()/4-15);
        Quit.setPosition(Gdx.graphics.getWidth()/2-Quit.getWidth()/2+(Gdx.graphics.getWidth()/4)+(Gdx.graphics.getWidth()/10),Gdx.graphics.getHeight()-(2* Quit.getHeight())+(Gdx.graphics.getHeight()/10)-270);
        Quit.addListener(new InputListener(){
            @Override
            public void touchUp (InputEvent event, float x, float y, int pointer, int button) {
                Gdx.app.exit();
                System.exit(-1);
            }
            @Override
            public boolean touchDown (InputEvent event, float x, float y, int pointer, int button) {
                return true;
            }
        });




        batch = new SpriteBatch();
        img = new Texture("BG.jpg");
        stage.addActor(newgame);
        stage.addActor(SavedGame);
        stage.addActor(Login);
        stage.addActor(Quit);

    }

    @Override
    public void show() {
        Gdx.input.setInputProcessor(stage);
    }
    public void create () {

    }
    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(img, 0, 20,638,440);
        batch.end();
        stage.act();
        stage.draw();

    }


    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        stage.dispose();
        batch.dispose();
        img.dispose();
    }

}
package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class GameScreen implements Screen {
    SpriteBatch batch;
    Texture img;
    private Stage stage;
    private Game game;
    private Label outputLabel;

    public GameScreen(Game aGame) {
        game = aGame;
        stage = new Stage(new ScreenViewport());
        Skin mySkin=new Skin(Gdx.files.internal("skin/star-soldier-ui.json"));

        final TextButton resume = new TextButton("Resume",TankStars.myskin);
        resume.setWidth(Gdx.graphics.getWidth()/3);
        resume.setHeight(Gdx.graphics.getHeight()/4-25);
        resume.setPosition(Gdx.graphics.getWidth()/2-resume.getWidth()/2,Gdx.graphics.getHeight()/2-resume.getHeight()/2+150);
        resume.addListener(new InputListener(){
            @Override
            public void touchUp (InputEvent event, float x, float y, int pointer, int button) {
                game.setScreen(new GameScreen(game));
            }
            @Override
            public boolean touchDown (InputEvent event, float x, float y, int pointer, int button) {
                return true;
            }
        });
        final TextButton Save = new TextButton("Save Game",TankStars.myskin);
        Save.setWidth(Gdx.graphics.getWidth()/3);
        Save.setHeight(Gdx.graphics.getHeight()/4-25);
        Save.setPosition(resume.getX(), resume.getY()- Save.getHeight());
        Save.addListener(new InputListener(){
            @Override
            public void touchUp (InputEvent event, float x, float y, int pointer, int button) {
                game.setScreen(new GameScreen(game));
            }
            @Override
            public boolean touchDown (InputEvent event, float x, float y, int pointer, int button) {
                return true;
            }
        });

        final TextButton Menu = new TextButton("Main Menu",TankStars.myskin);
        Menu.setWidth(Gdx.graphics.getWidth()/3);
        Menu.setHeight(Gdx.graphics.getHeight()/4-25);
        Menu.setPosition(resume.getX(), Save.getY()- Menu.getHeight());
        Menu.addListener(new InputListener(){
            @Override
            public void touchUp (InputEvent event, float x, float y, int pointer, int button) {
                game.setScreen(new MainMenu(game));
            }
            @Override
            public boolean touchDown (InputEvent event, float x, float y, int pointer, int button) {
                return true;
            }
        });

        final TextButton Quit = new TextButton("Quit",TankStars.myskin);
        Quit.setWidth(Gdx.graphics.getWidth()/3);
        Quit.setHeight(Gdx.graphics.getHeight()/4-25);
        Quit.setPosition(resume.getX(), Menu.getY()- Quit.getHeight());
        Quit.addListener(new InputListener(){
            @Override
            public void touchUp (InputEvent event, float x, float y, int pointer, int button) {
                game.setScreen(new MainMenu(game));
            }
            @Override
            public boolean touchDown (InputEvent event, float x, float y, int pointer, int button) {
                return true;
            }
        });

        ImageButton pause = new ImageButton(mySkin);
        pause.setSize(Gdx.graphics.getWidth()/6-10,Gdx.graphics.getHeight()/6-10);
        pause.getStyle().imageUp = new TextureRegionDrawable(new TextureRegion(new Texture(Gdx.files.internal("pause.png"))));
        pause.getStyle().imageDown = new TextureRegionDrawable(new TextureRegion(new Texture(Gdx.files.internal("pause.png"))));
        pause.setPosition(Gdx.graphics.getWidth()-100,Gdx.graphics.getHeight()-100);
        pause.addListener(new InputListener(){
            @Override
            public void touchUp (InputEvent event, float x, float y, int pointer, int button) {
                stage.addActor(resume);
                stage.addActor(Save);
                stage.addActor(Menu);
                stage.addActor(Quit);
            }
            @Override
            public boolean touchDown (InputEvent event, float x, float y, int pointer, int button) {
                return true;
            }
        });
        batch = new SpriteBatch();
        img = new Texture("2.jpg");
        stage.addActor(pause);

//        outputLabel = new Label("Press a Button",mySkin,"small");
//        outputLabel.setSize(pause.getWidth()+10, pause.getHeight());
//        outputLabel.setPosition(pause.getX(),pause.getY()-10);
//        outputLabel.setAlignment(Align.center);
//        stage.addActor(outputLabel);

    }

    public void create () {

    }


    @Override
    public void show() {
        Gdx.input.setInputProcessor(stage);
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
    public void dispose () {
        batch.dispose();
        img.dispose();
        stage.dispose();
    }
}

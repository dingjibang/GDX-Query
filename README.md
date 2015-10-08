# Get Start (我该咋用)
1. [Download Last Releases(下载jar包)](https://github.com/dingjibang/GDX-Query/releases/latest)
2. [read demos(读一读示例程序)](https://github.com/dingjibang/GDX-Query/tree/master/src/demo)
3. [read Wiki(for chinese only)(读一下wiki)](https://github.com/dingjibang/GDX-Query/wiki)

# What's this?(这个项目是什么)

[libgdx](https://github.com/libgdx/libgdx) is a game engine that help you to enjoy create yourself's game.<br>
But,sometimes you have to waste time in the UI module, for example:<br>
Libgdx是一个游戏引擎，能让你快速的享受着游戏开发的乐趣。<br>
但是有时候你会发现，写UI（界面）部分的代码异常的多与乱，甚至比你的核心逻辑部分还要多，这归根到底是因为：<br>

    Image backgroundImage = new Image(new Texture(Gdx.files.internal("your texture file path")));
    backgroundImage.setPosition(30,50);
    backgroundImage.setColor(1,1,1,0);
    backgroundImage.addAction(some Actions);
    backgroundImage....
    
    stage.add(backgroundImage);

It's redundancy code if your not use this "backgroundImage" variable on other side, you have to code 5 and more lines, it will makes your code not readable.<br>
GDX-Query can simplify your code, inspiration of JQuery.js:<br>
看到上面的代码，你会发现他非常的冗余，你为了在界面里显示张背景图片，而不得不创建一个变量，然后设置一堆堆东西，最后加到stage里，显然这非常的麻烦，并且让你的代码变得越来越不可读。<br>
GDX-Query项目应此而生，它可以简化你的代码，从而让你全身心投入到游戏的逻辑开发，而不是写逗逼的界面UI代码，它的操作类似JQuery:<br>

    $.image("your texture file path").setPosition(30,50).setColor(1,1,1,0).appendTo(stage);
  
It's funny? 
是不是很爽？
等等，还没完，它不仅仅有这么点功能，不点右边的链接你怎么知道如何使用？？ ->[读一下wiki](https://github.com/dingjibang/GDX-Query/wiki)

package tern

import cats.implicits._
import com.monovore.decline._

object HelloWorld
    extends CommandApp(
      name = "hello-world",
      header = "Says hello!",
      main = {
        val userOpt =
          Opts
            .option[String]("target", help = "Person to greet.")
            .withDefault("world")

        val quietOpt = Opts.flag("quiet", help = "Whether to be quiet.").orFalse

        val init = Opts
          .subcommand("init", "", true)(Opts.unit)
          .map(_ => println("initializing..."))

        val migrate =
          Opts
            .subcommand("migrate", "", true)(Opts.unit)
            .map(_ => println("migrate..."))

        val clean = Opts
          .subcommand("clean", "", true)(Opts.unit)
          .map(_ => println("clean..."))

        init orElse migrate orElse clean

        // (userOpt, quietOpt).mapN { (user, quiet) =>
        //   if (quiet) println("...")
        //   else println(s"Hello $user!")
        // }
      }
    )

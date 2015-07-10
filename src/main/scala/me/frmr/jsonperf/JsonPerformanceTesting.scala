package me.frmr.jsonperf

import net.liftweb.json._
  import JsonDSL._

object JsonPerformanceTesting {
  val json = """
    [
      {
        "_id": "559edf615784b9a54f8ad03c",
        "index": 0,
        "guid": "83b0d457-13e7-49dd-ac09-03b0b2354e29",
        "isActive": true,
        "balance": "$2,568.41",
        "picture": "http://placehold.it/32x32",
        "age": 38,
        "eyeColor": "green",
        "name": {
          "first": "Vincent",
          "last": "Moody"
        },
        "company": "NETERIA",
        "email": "vincent.moody@neteria.me",
        "phone": "+1 (919) 421-3443",
        "address": "411 Glenmore Avenue, Axis, Missouri, 5705",
        "about": "Do excepteur cillum nisi occaecat ipsum ea nulla tempor. Incididunt non reprehenderit magna laborum voluptate esse. Dolore ipsum cupidatat ut adipisicing sint voluptate eu dolore excepteur sint duis reprehenderit cillum. Mollit officia consequat non nostrud. Mollit tempor eu aliquip amet incididunt exercitation consectetur dolor laboris id esse sint eu sunt. In est deserunt esse do voluptate non aute aliqua id aliqua sint. Aliquip laboris ut eu quis excepteur quis laborum pariatur ipsum adipisicing duis quis cupidatat.",
        "registered": "Monday, June 1, 2015 7:02 PM",
        "latitude": "-61.877747",
        "longitude": "-71.749283",
        "tags": [
          "et",
          "cillum",
          "irure",
          "mollit",
          "dolore",
          "mollit",
          "ea",
          "custom_tag"
        ],
        "range": [
          0,
          1,
          2,
          3,
          4,
          5,
          6,
          7,
          8,
          9
        ],
        "friends": [
          {
            "id": 0,
            "name": "Lavonne Valentine"
          },
          {
            "id": 1,
            "name": "Garcia Pearson"
          },
          {
            "id": 2,
            "name": "Hutchinson Sullivan"
          }
        ],
        "greeting": "Hello, Vincent! You have 8 unread messages.",
        "favoriteFruit": "strawberry"
      },
      {
        "_id": "559edf61a586f2ee1f6f19f4",
        "index": 1,
        "guid": "8ea01e93-5862-4344-bc9e-896dc53a9db8",
        "isActive": false,
        "balance": "$3,127.61",
        "picture": "http://placehold.it/32x32",
        "age": 35,
        "eyeColor": "brown",
        "name": {
          "first": "Lessie",
          "last": "Foster"
        },
        "company": "EARTHWAX",
        "email": "lessie.foster@earthwax.io",
        "phone": "+1 (962) 445-2259",
        "address": "745 Jerome Street, Sattley, North Dakota, 7105",
        "about": "Consectetur nostrud pariatur ipsum irure tempor. Ea magna ad qui pariatur adipisicing ipsum eiusmod pariatur do id. Dolor reprehenderit irure laborum officia pariatur. Proident sunt consectetur proident est consectetur mollit nostrud cupidatat incididunt. Commodo laborum qui occaecat est adipisicing. Consequat non voluptate elit culpa dolor est incididunt deserunt qui. Ad pariatur qui elit non et quis nisi mollit.",
        "registered": "Sunday, April 6, 2014 6:58 PM",
        "latitude": "-21.587629",
        "longitude": "-113.384443",
        "tags": [
          "et",
          "cillum",
          "irure",
          "mollit",
          "dolore",
          "mollit",
          "ea",
          "custom_tag"
        ],
        "range": [
          0,
          1,
          2,
          3,
          4,
          5,
          6,
          7,
          8,
          9
        ],
        "friends": [
          {
            "id": 0,
            "name": "Lavonne Valentine"
          },
          {
            "id": 1,
            "name": "Garcia Pearson"
          },
          {
            "id": 2,
            "name": "Hutchinson Sullivan"
          }
        ],
        "greeting": "Hello, Lessie! You have 8 unread messages.",
        "favoriteFruit": "banana"
      },
      {
        "_id": "559edf611ebf53abd8ad4a2d",
        "index": 2,
        "guid": "dbe3bcf4-72d1-46c4-bdfd-0b31be5de696",
        "isActive": true,
        "balance": "$3,777.05",
        "picture": "http://placehold.it/32x32",
        "age": 22,
        "eyeColor": "green",
        "name": {
          "first": "Jodie",
          "last": "Cabrera"
        },
        "company": "COMVERGES",
        "email": "jodie.cabrera@comverges.org",
        "phone": "+1 (877) 424-2672",
        "address": "869 Hornell Loop, Vallonia, North Carolina, 4981",
        "about": "Ex est sint eu consequat ea elit nostrud reprehenderit voluptate cillum incididunt. Velit esse et in ullamco veniam ex adipisicing ea id ut esse. Sunt ad aliqua consequat consequat irure. Magna do ex nisi tempor. Qui ut eiusmod dolore ullamco labore tempor aliqua est labore fugiat duis aliquip deserunt consequat.",
        "registered": "Sunday, June 1, 2014 6:53 PM",
        "latitude": "76.188359",
        "longitude": "98.145981",
        "tags": [
          "et",
          "cillum",
          "irure",
          "mollit",
          "dolore",
          "mollit",
          "ea",
          "custom_tag"
        ],
        "range": [
          0,
          1,
          2,
          3,
          4,
          5,
          6,
          7,
          8,
          9
        ],
        "friends": [
          {
            "id": 0,
            "name": "Lavonne Valentine"
          },
          {
            "id": 1,
            "name": "Garcia Pearson"
          },
          {
            "id": 2,
            "name": "Hutchinson Sullivan"
          }
        ],
        "greeting": "Hello, Jodie! You have 8 unread messages.",
        "favoriteFruit": "strawberry"
      },
      {
        "_id": "559edf612626f72fd32be8ff",
        "index": 3,
        "guid": "fb585644-2dba-49b9-a494-f0a1cf0a269f",
        "isActive": false,
        "balance": "$1,709.77",
        "picture": "http://placehold.it/32x32",
        "age": 20,
        "eyeColor": "brown",
        "name": {
          "first": "Farrell",
          "last": "Mcbride"
        },
        "company": "HELIXO",
        "email": "farrell.mcbride@helixo.com",
        "phone": "+1 (912) 529-2497",
        "address": "321 Hillel Place, Brule, District Of Columbia, 9332",
        "about": "Officia fugiat Lorem amet ad labore voluptate eu voluptate aliquip ullamco. Excepteur et voluptate aliquip elit dolor reprehenderit esse id quis consectetur enim labore aliqua tempor. Do incididunt deserunt cillum veniam id nisi reprehenderit excepteur exercitation ullamco.",
        "registered": "Wednesday, March 19, 2014 1:01 AM",
        "latitude": "77.212541",
        "longitude": "-40.375271",
        "tags": [
          "et",
          "cillum",
          "irure",
          "mollit",
          "dolore",
          "mollit",
          "ea",
          "custom_tag"
        ],
        "range": [
          0,
          1,
          2,
          3,
          4,
          5,
          6,
          7,
          8,
          9
        ],
        "friends": [
          {
            "id": 0,
            "name": "Lavonne Valentine"
          },
          {
            "id": 1,
            "name": "Garcia Pearson"
          },
          {
            "id": 2,
            "name": "Hutchinson Sullivan"
          }
        ],
        "greeting": "Hello, Farrell! You have 10 unread messages.",
        "favoriteFruit": "banana"
      },
      {
        "_id": "559edf6113cfc9543d78d927",
        "index": 4,
        "guid": "101dc70e-c4db-4eb2-be37-71b7c043aefd",
        "isActive": true,
        "balance": "$3,980.53",
        "picture": "http://placehold.it/32x32",
        "age": 40,
        "eyeColor": "brown",
        "name": {
          "first": "Ericka",
          "last": "Hahn"
        },
        "company": "ZORK",
        "email": "ericka.hahn@zork.us",
        "phone": "+1 (810) 579-2074",
        "address": "476 Homecrest Court, Rushford, Texas, 4140",
        "about": "Do incididunt ipsum non duis nostrud in mollit non mollit. Laboris nostrud dolor tempor do nulla reprehenderit. Voluptate duis amet incididunt commodo. Incididunt adipisicing est amet magna. Et id proident proident fugiat enim exercitation. Id do mollit amet consectetur laboris labore ea tempor minim ullamco reprehenderit id cillum. Enim aliquip ex laborum aliquip ipsum cillum officia reprehenderit aliquip deserunt.",
        "registered": "Wednesday, June 4, 2014 6:30 PM",
        "latitude": "-50.266133",
        "longitude": "-159.946927",
        "tags": [
          "et",
          "cillum",
          "irure",
          "mollit",
          "dolore",
          "mollit",
          "ea",
          "custom_tag"
        ],
        "range": [
          0,
          1,
          2,
          3,
          4,
          5,
          6,
          7,
          8,
          9
        ],
        "friends": [
          {
            "id": 0,
            "name": "Lavonne Valentine"
          },
          {
            "id": 1,
            "name": "Garcia Pearson"
          },
          {
            "id": 2,
            "name": "Hutchinson Sullivan"
          }
        ],
        "greeting": "Hello, Ericka! You have 7 unread messages.",
        "favoriteFruit": "strawberry"
      }
    ]
  """

  def main(args: Array[String]) = {
    println("hi mom")
  }
}

-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 10, 2020 at 08:31 PM
-- Server version: 10.4.13-MariaDB
-- PHP Version: 7.4.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

--
-- Database: `nccf management system`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `user_name` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `E_mail` varchar(100) NOT NULL,
  `Sec_Q` varchar(200) NOT NULL,
  `Answer` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `user_name`, `password`, `E_mail`, `Sec_Q`, `Answer`) VALUES
(1, 'admin', 'admin', 'rextech@gmail.com', 'what is the name of your fellowship', 'Nigeria Christian Corper\'s Fellowship');

-- --------------------------------------------------------

--
-- Table structure for table `attendance`
--

CREATE TABLE `attendance` (
  `id` int(11) NOT NULL,
  `serial_number` int(50) NOT NULL,
  `name` varchar(100) NOT NULL,
  `sex` varchar(50) NOT NULL,
  `batch` varchar(50) NOT NULL,
  `units` varchar(200) NOT NULL,
  `address` varchar(100) NOT NULL,
  `phone_number` varchar(100) NOT NULL,
  `Dob` varchar(20) NOT NULL,
  `attendance_status` varchar(100) NOT NULL,
  `date` varchar(20) NOT NULL,
  `time` varchar(20) NOT NULL,
  `days` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `attendance`
--

INSERT INTO `attendance` (`id`, `serial_number`, `name`, `sex`, `batch`, `units`, `address`, `phone_number`, `Dob`, `attendance_status`, `date`, `time`, `days`) VALUES
(1, 1, 'AGAMUYI PRECIOUS EDOBOR', 'Male', 'B2', 'BIBLE STUDY AND CHOIR', 'FAMILY HOUSE', '08164224004', '12/22/94', 'P--Present', '4/26/20', '2:00PM', 'tuesday, thursday'),
(2, 2, 'SAMSON ALEXANDER', 'Male', 'Senior Friend', 'nil', 'F.H', '08035684049', '4/27/20', 'present', '4/27/20', '12:00noon', 'Sunday,friday'),
(3, 3, 'bro ikenna james', 'Male', 'Senior Friend', 'prayer', 'family house', '0977458678469', '5/30/20', 'P--Present', '5/31/20', '2:00pm', 'Sunday');

-- --------------------------------------------------------

--
-- Table structure for table `membership`
--

CREATE TABLE `membership` (
  `id` int(100) NOT NULL,
  `name` varchar(200) NOT NULL,
  `sex` varchar(100) NOT NULL,
  `call_up_no` varchar(200) NOT NULL,
  `state_code` varchar(50) NOT NULL,
  `phone_no` varchar(200) NOT NULL,
  `e_mail` varchar(200) NOT NULL,
  `state_of_origin` varchar(200) NOT NULL,
  `lga` varchar(100) NOT NULL,
  `DOB` varchar(100) NOT NULL,
  `POB` varchar(50) NOT NULL,
  `perm_home_address` varchar(200) NOT NULL,
  `langaues_spoken` varchar(200) NOT NULL,
  `engagement_status` varchar(50) NOT NULL,
  `health_challenge` varchar(20) NOT NULL,
  `if_state_yes` varchar(500) NOT NULL,
  `name_kin` varchar(50) NOT NULL,
  `phone_kin_no` varchar(50) NOT NULL,
  `institutions_attended` varchar(100) NOT NULL,
  `course` varchar(50) NOT NULL,
  `date` varchar(50) NOT NULL,
  `name_secular_school` varchar(200) NOT NULL,
  `post_held` varchar(50) NOT NULL,
  `date_secular` varchar(50) NOT NULL,
  `born_again` varchar(100) NOT NULL,
  `if_yes_when` varchar(200) NOT NULL,
  `conversion_experience_yes` varchar(200) NOT NULL,
  `local_church_attended` varchar(100) NOT NULL,
  `fellowship` varchar(50) NOT NULL,
  `have_baptized` varchar(50) NOT NULL,
  `baptized_when` varchar(200) NOT NULL,
  `have_baptized_holy_spirit` varchar(200) NOT NULL,
  `walk_God_been` varchar(200) NOT NULL,
  `church_group` varchar(200) NOT NULL,
  `post_held_group` varchar(100) NOT NULL,
  `date_church_group` varchar(50) NOT NULL,
  `do_have_ministry_own` varchar(50) NOT NULL,
  `do_have_special_calling` varchar(50) NOT NULL,
  `if_yes_details` varchar(200) NOT NULL,
  `do_u_intend_serve_christian` varchar(50) NOT NULL,
  `if_yes_give_details` varchar(200) NOT NULL,
  `do_u_redeploy` varchar(50) NOT NULL,
  `if_yes_why` varchar(100) NOT NULL,
  `stay_family_house` varchar(100) NOT NULL,
  `willing_to_serve` varchar(200) NOT NULL,
  `name_leader` varchar(200) NOT NULL,
  `number_christian_leader` varchar(50) NOT NULL,
  `fellowship_church` varchar(100) NOT NULL,
  `unit_1` varchar(20) NOT NULL,
  `unit_2` varchar(20) NOT NULL,
  `unit_3` varchar(20) NOT NULL,
  `unit_4` varchar(200) NOT NULL,
  `use_computer` varchar(50) NOT NULL,
  `if_yes_how_well` varchar(20) NOT NULL,
  `do_drive` varchar(50) NOT NULL,
  `how_long` varchar(50) NOT NULL,
  `licensed` varchar(50) NOT NULL,
  `do_u_play_instrument` varchar(50) NOT NULL,
  `if_yes_list` varchar(100) NOT NULL,
  `talented_art_work` varchar(100) NOT NULL,
  `photo` longblob DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `membership`
--

INSERT INTO `membership` (`id`, `name`, `sex`, `call_up_no`, `state_code`, `phone_no`, `e_mail`, `state_of_origin`, `lga`, `DOB`, `POB`, `perm_home_address`, `langaues_spoken`, `engagement_status`, `health_challenge`, `if_state_yes`, `name_kin`, `phone_kin_no`, `institutions_attended`, `course`, `date`, `name_secular_school`, `post_held`, `date_secular`, `born_again`, `if_yes_when`, `conversion_experience_yes`, `local_church_attended`, `fellowship`, `have_baptized`, `baptized_when`, `have_baptized_holy_spirit`, `walk_God_been`, `church_group`, `post_held_group`, `date_church_group`, `do_have_ministry_own`, `do_have_special_calling`, `if_yes_details`, `do_u_intend_serve_christian`, `if_yes_give_details`, `do_u_redeploy`, `if_yes_why`, `stay_family_house`, `willing_to_serve`, `name_leader`, `number_christian_leader`, `fellowship_church`, `unit_1`, `unit_2`, `unit_3`, `unit_4`, `use_computer`, `if_yes_how_well`, `do_drive`, `how_long`, `licensed`, `do_u_play_instrument`, `if_yes_list`, `talented_art_work`, `photo`) VALUES
(1, 'AGAMUYI PRECIOUS EDOBOR', 'MALE', 'NYSC/FRN/2019/711782', 'GM/19B/2565', '08164224004', 'agamuyirex63@gmail.com', 'EDO STATE', 'ORHIONMWON', '22/12/1994', 'BENIN CITY', '1 IRUBOR STREET ABUDU, EDO STATE', 'ENGLISH, IKA, BENIN, FRENCH', 'SINGLE', 'No', 'NONE', 'AYI PETER', '07066752057', 'ESTAM-FORMATION', 'COMPUTER SCIENCE', '10/5/2019', 'Yes', 'NO', 'NONE', 'NONE', 'SINCE 2008', 'GREAT', 'CHRIST CHOSEN CHURCH', 'CHOSEN FELLOWSHIP', 'No', 'NONE', 'Yes', 'GREAT', 'ANGLICAN FELLOWSHIP', 'ASSISTANT YOUTH LEADER', '27/7/2016-10/5/2019', 'No', 'Yes', 'SINGING', 'No', 'NONE', 'No', 'NONE', 'Yes', 'No', 'AIMINAHO HARMONY', '08038974557', 'CNM', 'BIBLE STUDY ', 'DRAMA ', 'PRAYER ', 'TECHNICAL/ORG. ', 'Yes', 'PROFICENT', 'No', 'NONE', 'No', 'Yes', 'DRUM', 'No', 0xffd8ffe000104a46494600010100000100010000ffed009c50686f746f73686f7020332e30003842494d04040000000000801c0267001456392d59676c4a67366e6e2d4779766c6a6b6e6c1c0228006246424d4430313030306162653033303030303732316330303030636234303030303035633432303030303566343430303030323836313030303035303963303030303937613230303030343861373030303032636163303030303831343330313030ffe2021c4943435f50524f46494c450001010000020c6c636d73021000006d6e74725247422058595a2007dc00010019000300290039616373704150504c0000000000000000000000000000000000000000000000000000f6d6000100000000d32d6c636d7300000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000a64657363000000fc0000005e637072740000015c0000000b777470740000016800000014626b70740000017c000000147258595a00000190000000146758595a000001a4000000146258595a000001b80000001472545243000001cc0000004067545243000001cc0000004062545243000001cc0000004064657363000000000000000363320000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000074657874000000004642000058595a20000000000000f6d6000100000000d32d58595a20000000000000031600000333000002a458595a200000000000006fa2000038f50000039058595a2000000000000062990000b785000018da58595a2000000000000024a000000f840000b6cf63757276000000000000001a000000cb01c903630592086b0bf6103f15511b3421f1299032183b92460551775ded6b707a0589b19a7cac69bf7dd3c3e930ffffffdb004300090607080706090808080a0a090b0e170f0e0d0d0e1c14151117221e2323211e2020252a352d2527322820202e3f2f3237393c3c3c242d4246413a46353b3c39ffdb0043010a0a0a0e0c0e1b0f0f1b392620263939393939393939393939393939393939393939393939393939393939393939393939393939393939393939393939393939ffc0001108007800b403012200021101031101ffc4001c0000010501010100000000000000000000040002030506010708ffc4003e100002010303010604040306050500000001020300041105122131061322415161147181911532a1c14262b1071623d1e1f024335272a2348292c2f1ffc4001801000301010000000000000000000000000001020304ffc4001d110101000300030101000000000000000000010211210312314151ffda000c03010002110311003f00f0ea54a9c050080ae814853a98202ba052029c2822029c052029c050080aee29c05380a0198a58a9314b140496166d7b7696eac14be7c47c800493fa55bdcd8be96dab2322aee806d553bb6a975143767632faac5b46480481f4c7ef57ddaa0b73aa5f2429e194c4a5879788939fae6a6deaa4e32faba3c46d606ce2381719f719fdebb72ed1e8b6b06462476908fae07ef456ab19bad425dec5521849071e4a3803eb4db9862fc255ca932c51a639e9b9c9cfd87eb400f670ba6917b395ca4856207dfaff0095431586fd367bd69001190a140e49247fafdaaca282597b391c5129265bacfb0e3193edcd4daa5a0b0d0a2b72b8909cc847218ee3823e828d8d3324537152115cc64d52569a30d3e081eeaed4caeac42c4067cbafa0f99aac9a50cf2154c0639009e944472ac56cf1b60b13c628361c9a0dc6727c852a69a548382a68c44c407dc9c75519c9f9531a32bd6a48d4119c91ce29ec1a50819c823e7480a92555dc0a8c0c571141ce4e0fe940700a7015218d02e44aa4e3a1041a681411014f02bb1a1760a3a9a325b09a2b759f00c67a907a1e7fca830a053b152c10999980206d52c49f6a5dd905548e5b18a648f15cc54f730f713bc59ddb4e322991466495235eac40a02e7b1f133eaa1d724a0e83af5abeb8b23f177e6e4bf771cc8d95e8c096fd38343761208e3d6668cb7237a83ec011579aadb6c37acef95da00da719c31c7d39cd6595eb4c6718dd6086ba99510002d51030f76193fad4bda4b55b2d2a04560c640bb88e7a0a2b5d8d1b380142da8eeff98893fad41da28d97b3763b896266273f35a73f0acfaeac6d1f666cd10e1a798673e5c81fefe551f6863326930c8af958c8193e792471f6ab7b5897f0cb75688b98d5593d01dc327f5a676c6dda3d1a21dda46a029db9e7affa9a52f4f5c6088a6e39a908a6e3915a33265f067dea37039c51254f7270b91b873f7a85d71bfda80818734a9ccbcf4a548cf7036039ea7a5390621cff003535959506e180dc8cd390f808cfeb4014891c912931305ced0feff3a15780d46c66316d190e4b16e63e405e3839f9d043ce9415232311b82b6d1e78a7c71068f7679f4a9963c47b770dacbc7887af9fa5323f02b0f7ebf714c0bd22cc4f73086620307e9e440e28fba59a6b291a4727bb518de724f3eb4eecf299a78d643e148e46e98c6063f61523c4cba7a46bbb74a7247b714ade9c802d6d196f25b70727f26e1cf5207ef45ea1a6b45acb5ba1cc711442edc0f2a274b8564d522551912cd18cf9f1c9ab6d4ecc8d52e311e487e3d0f8738fb9a5edd3938cec369f1370c31bde507c24636f8c0ff7f3aaeb45d97a8ad8cabe0fcf35b2b0b5cc84a800f759e7c8f787a7dab362da112f8739f880371eb8f3fd69cc8ac5b762987e3139f33c0fbd6bf532a7529d4aee0f11c9f4e82b19d951ddeb2aa0740371f7cd6c7542df1f2631ff0020819f5e3fcab3cbeaf1f8cb6b518fc2cc80a931a3af5c79a9cff5a8f5c2cdd98806772ac919f975a9f56512f67e72bc012483e7c67f6a16f3c5d93ce4e774791edba985ce9a1ae2cd60dbc05ce738e0609fd4541db541268b0ca5f254f073cf975f6a93459cfc0923a95207daa4d7a5dba14532a26e12104119f31d7dbaf14bf4ff001e6fb4b1000c93c0a226d3ae2036fdea6defff0027209eb8e4797d69af1b2ed9400149e31c60d75d9a7ba42c77166009c939fbd6cc93de59c76f0203306766e4647141cd1c4bde62453d318353dcc1b15b8036b0f2a1a45ff9bf3a4114a1370c30e9eb4a94a30df4a54c2f748d16df50b9b988ce0845dd1989b70009c60e453b5aece269d6f1ca9700976dbb5c6d1d09cd7741ee922d40b5d3247f0eb996353b80dd8e86ac9069d2688b1cd7b772db77c51588c30c0c91f2ae7b9595ac92c55d9f673509a38d834222701b76ff0023cf22b8fd97bb4c8375664e338ef704fe95a78e2823d5ad6259a6ca43ddac78f09183c93ebf4aac9ad3423248ee2e2282dd0e76b9ceec81c75a9c7c995aabe392292c74bbe94858a067e3a670091ce3e7439b69d66785e365941c1523a1ad95ac1a3db782dae6e84c6169154cc08c953edc8ea2a82fa46fc4808b1991064b027f87ad698e76d46586a0cecec47e0ee6662774716de7dcd4f3c676438e090467d2a7d3ed8c1a3cc8324c8ca7f2e381525c776d6f12e18153e2e29efa5a0bd9904eb16ccc3c2ae483ee0d68b51602eae06dfe26f97e5aacecfdab03a7b28e4976e9cf5357b7d6ee6663b0e599b1f61536f552701590225638c1eec838ff00b89ac7024dd47e8663fd6b7d6f69228048c7247d3358fd46d5a08eddbf2ff8ae327e54f1a3283b414027eff1e37b90bf3e6b53a8c7ff00192927a4447e82a97b3f6cddddbf00ee9f771f3ad06a719f8990ff0029fe94ade9c9c64dd0c9a4dc28c10ae703e61a8688197b2d77b8038d98fa30ab1b5889b2bcc86c19703ff2a120876f672f63c16da148ff00e429a53e97ff00a470393b24c0a2b568c4bd9db8fe57cfef41695e192545f247c7daadb067d26e232b92d211ff0088a47187d52d8c5a7e9ea80962cdc8f3f4a1adacb79deddf0915ba0518f6e49ad16a561f13a4c4fb46e80be460f4fbd0896ed1e8e9a87751bec9c284d9d739279cfb569326771555cc12ccaec10860ea0038c9ebcf150dcd94d9bbf06487fbf356ab028ba82e0597859776d273938eb41dcc46ee62e6058d5df9ebe74f7be8d69557a8526019402541e3a74a55713e9b6fbc7e71e15f3f614a8990d2c74959bbebc5163197300db1145018eef3f23f5a325b5bf3a7aabd859097be2763a2950368c1c7ad05a3325b49335d6163963da409771c13eb9f4a3a3d4e282dd208880a92127c5c907a0e73cd72dbfc6da3a6b8bc4be4b86369141c165271838e70719e280372c8f339bfb112ba15438dc13907fe9f4a76a5adc7dd1531a48de68402a7e631405bd95e5cf7a889629df9dc132bb9075c2f9d18e3cdd3b7ba8b2935b48c3335d5a32f72576471f88be0f20e3d6aa74c9e49b518c42f32a01c82dcb1f535609a56a0a33f136e802776db533d3ccf87afbd3f46d32386edb178929898a9419f09f31cd5e3eb3e15f6aba963ee614672c773648cf27d6a39a7b1dbcdbca4b723c428ebe801895707a93c75154b731958b7edc95e955135b4ec969f657ba55adeab0468dd90216191f31d6aeeead6d42e252173900f3cfbd797e9f7460448d49da3271f3aedeea1223f86472319c063d69f06ebd422b6808118201ce7c4a4639c7a552f697b3563f85c59d422590dc33619d41248e8338ac425ece6651bdff28eac689b6d3ef35499618e377f1679a38375b5d274aee22b70be2083afad7752b590bc8c3a91fa62b4fa0699f0fa6c2180240db5cbcb25ef4e33cfa629fa70bdfaf3786d5c417684156efbd3de85587e1f41bd665dd9c8dbd3f8abd19b4850d3677104ef3c03d31ef50ea7a3c634c93ba921208008e327ed4bd68dc79c69f1a99de421c931b63dc9abb8617fc3d9cae14b6f3b79f2c7ed475a6892c2e58900331191e63fd9aba834d68aca54d870010479f4a5ab4f723ce2f8349a2cbb0907bd61852413c9acec7ab5ec76a96cc44b044fde2a163c37af15a9d413b8d109008dd2b1ac68d88e5819173d718e6af1fea3246b7577df77f186c163b42f201f4e957da66b504564cef06fb95f11795b254f91c719fa7a567d55142859f015b3820e3ed51cab2348c7bf56c92478ff00ceaedbad26364bda412a2bb59432123f38dc377a1c6ee38c52ac89bad41123486e9911540c2b714aa7517ed485fa2aca1e79641c88d8800fd3d285594cc82289e43231c7273c7a7de9a92a29f08817e637734547a8b246e865dc1976f813151ad7c837fd410c732485c776a14e0891c633f22688825923bb6305c3051c83b8f0284df086ca424739196a9d657deb844071807ae05568b7a17f88ce4211bb72828c3f97007df8a33b3cfb6f4384f0b3961ce48e0f5fbd02a93306264c639e140a274fdd15c2bb3b1c7a9a3d6483db75e8d6a05cc32279ed241f31815537f67dda852782d8f7a3fb2ae65ba29c904e31f306b5d2e82af6c8f246158306271e431d7f5a998d5db1e5c6d1cb80aac70428c0c5171e8d25c052c3f85871fcbd6b752d85b5ace4c56c1a36292b875c81cb003ebd68ed3f4d9120c3151334871e1f16de4b6075c74a7aa5b8c3268f1db5c02e0b98f83fa63ffb7dab65a15b84812e046162c925bcf18193feb51ddea9a7594cb6ccb1cb3f2191082d90bcee6fcaa07d4d0967abfe2eb7104c889a7b422458d063033c73d49ce2893437b6decef6d174e8da095648cbb2ee539c11d467d6a29a68a5b8036f3d4678ce33596b5d38d9f77756b3c9199948da8d8040f51e7f5ab6bcbabab452d2471cc101c1036f973d3806ae5469cb7d405f4b731c36d12c8610c3767c409e73f7a034ad512f3e2ed4d9a24683bc255cf246463ef9ace58f6d6c92e64924d36e12511888347329c0f519039ae699da3d1ed599a04bf8cb4615d762904eece7f37b9e0521b8dcda5cdb4d70b68f0b2c91032f5c8c7157113433acbb08ce7047422b0bfdecd116f259e05d411e489a361dcaf1c0c30f1796051169db5b3887f87a7dd492719e523070b8e4ee269ecb715ffda2e9620d152e21dad1b4e4653a720d793cb1100d7a3f6a7b57777da6774d6b6f6d65bf2b1ab6f727dcfd7d2b0371729264e00aac64d32cfc9665a53ca086a1dc9a3a76526837c669d3c72da32734a936dcf5a552b461715344314cc814f0c71c520e8153c4c370cf38a807353c42821c929c1038cd3edc31954d431213e5464303381b4e0d57ab3be491bffecd97bcd7f6311c26ec67ad7ac4912c91b21c61860d795ff6568d1f682452aab9b66f3ebcaf4af529889227557da482370f234b5a698e5ed36a5d42ff0046d3e693e22e374817c51290490b9e3e99accf687b5ba67c459089ef3e1e4249ee1826473c1c8c9e7de88ed369ab2eb105cc2165daa448a4796c39aca4fa4497fa769d75063bb4564c81f9429cf3f207f4a9b5a4822e6fb4882e1ed9ac264b9552c92f781b2ac390463c867eb44e95a9f67acac5126f8e5ef620ab921c70dc74c7424fdaaaefed3e27b4314b0a8749a34223ff00a4151807efd7deaa658be32ed6da21cc4e228cf40dff00e9c9a937b3dbad8bdc41dddc46ecd116546e09527f30f2eb45ead6dbb4abb41c930bf3ff00b4d6492de48b568248e42af6b67e1c747017f735b5b606e6ca359873244038f98e7fad5c4d9a7cde5c899ce7cea5b56c6ee7a8c54facd92daea3710a2b811b9521fa820e28046284d16227925ab38493275ab3b7e149dd8acfc13e1b3c559c574421f43c7350d25375b947c0f77bb8cfa5651a4f7abbd52e331ecf3e959d76c1ad31f8cf39baec8f50335759aa2634ca422f4aa3269506706f7a914d2a548d221e6888db14a9538cf2151cb8f3a3ad6e02b0cd2a5571cbe45fe93adcfa65ec57f6253bf8811b5f957523906bd1b44ed7697acc16e56fe2b5be5c99ada7ff000c3b11c907a7cb9a54aa726de0ba9a417b74b6ddaa4d3df7aa4b0aca554170a36306248f2040fbd43d8f6b94864b6bf8cc702b3a0f060f8f20939ebce39a54ab3759fa7e891ff7ba20182f770ab15fe12005538f7e68787b1f29d4eea568dd238a52f1b46b91230e82952a3436d6b456b629f15a9cb0c510b7eecb4ae170381d2b2bda1fed0ad92dcd8e80cd33eddad78c0858c7f2e7a9f7a54aae463e5cae338f31bdba8c31f1ef3e64f526ab1ee013d6952aaae6f098b380dc7ad16971e1e7247fdd4a9566eb81ae67dfd33f23cd55ccde2ff4a54a9c080b5309a54a987314a952a03fffd9);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `attendance`
--
ALTER TABLE `attendance`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UNIQUE` (`serial_number`);

--
-- Indexes for table `membership`
--
ALTER TABLE `membership`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `e_mail` (`e_mail`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `attendance`
--
ALTER TABLE `attendance`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `membership`
--
ALTER TABLE `membership`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

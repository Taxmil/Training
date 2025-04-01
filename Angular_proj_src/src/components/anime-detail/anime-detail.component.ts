import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { NgIf } from '@angular/common';
import { AnimeService } from '../../services/anime.service';
import { Anime } from '../../model/anime';

@Component({
  selector: 'app-anime-detail',
  templateUrl: './anime-detail.component.html',
  imports: [NgIf],
  styleUrls: ['./anime-detail.component.css']
})
export class AnimeDetailComponent implements OnInit {
  anime?: Anime;

  constructor(private route: ActivatedRoute, private animeService: AnimeService) {}

  ngOnInit(): void {
    const id = Number(this.route.snapshot.paramMap.get('id'));
    this.anime = this.animeService.getAnimeList().find(a => a.id === id);
  }
}

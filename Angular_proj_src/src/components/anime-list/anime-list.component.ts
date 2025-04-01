import { Component, OnInit } from '@angular/core';
import { NgFor } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { AnimeService } from '../../services/anime.service';
import { Anime } from '../../model/anime';
import { RouterModule } from '@angular/router';
import { AnimeFilterPipe } from "../../pipes/anime-filter.pipe";

@Component({
  selector: 'app-anime-list',
  standalone: true,
  imports: [NgFor, FormsModule, RouterModule, AnimeFilterPipe],
  templateUrl: './anime-list.component.html',
  styleUrls: ['./anime-list.component.css']
})
export class AnimeListComponent implements OnInit {
  animeList: Anime[] = [];
  searchText: string = '';

  constructor(private animeService: AnimeService) {}

  ngOnInit(): void {
    this.animeList = this.animeService.getAnimeList();
  }
}
